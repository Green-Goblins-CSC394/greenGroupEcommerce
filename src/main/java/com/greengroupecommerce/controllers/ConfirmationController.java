package com.greengroupecommerce.controllers;

import java.security.Principal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.greengroupecommerce.entities.Cart;
import com.greengroupecommerce.entities.OrderItems;
import com.greengroupecommerce.entities.Orders;
import com.greengroupecommerce.entities.Users;
import com.greengroupecommerce.repositories.CartRepository;
import com.greengroupecommerce.repositories.UsersRepository;

@Controller
public class ConfirmationController {

  @Autowired
  UsersRepository userRepository;

  @Autowired
  private CartRepository cartRepository;
  
  public ConfirmationController() {
  }

  @GetMapping("/confirmation")
  public String confirmationPage(Principal principal, Model model) {
    confirmation(principal, model);
    return "confirmation";
  }
  
  @PostMapping("/conf")
  public void confirmation(Principal principal, Model model) {

    Users user = this.userRepository.findByEmail(principal.getName());

    Orders order = new Orders();

    Timestamp currentTime = new Timestamp(System.currentTimeMillis());

    order.setTransactionPrice(this.userRepository.getCartTotal(user.getUserID()));
    order.setCompletedAt(currentTime);

    List<Cart> flagForRemoval = new ArrayList<Cart>();
    for(Cart cartItem : user.getCartItems()) {
      //create order item from cart item
      OrderItems orderItem = new OrderItems();
      orderItem.setProduct(cartItem.getProduct());
      orderItem.setQuantity(cartItem.getQuantity());
      orderItem.setSize(cartItem.getSize());
      orderItem.setOrder(order);

      //add new order item to order
      order.addOrderItemToOrder(orderItem);

      //delete order item from cart
      cartItem.setUser(null);
      flagForRemoval.add(cartItem);
      this.cartRepository.delete(cartItem);
    }
    
    user.getCartItems().removeAll(flagForRemoval);

    //apply order to user (bidirectionally)
    order.setUser(user);
    user.addOrderToUser(order);
    this.userRepository.save(user);

    return;
  }
}
