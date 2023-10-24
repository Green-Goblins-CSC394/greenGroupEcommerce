package com.greengroupecommerce.controllers;

import java.security.Principal;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greengroupecommerce.entities.Cart;
import com.greengroupecommerce.entities.Products;
import com.greengroupecommerce.entities.Users;
import com.greengroupecommerce.repositories.CartRepository;
import com.greengroupecommerce.repositories.ProductsRepository;
import com.greengroupecommerce.repositories.UsersRepository;

@Controller
public class CartController {
  public CartController() {
  }

  @Autowired
  private CartRepository cartRepository;

  @Autowired
  private ProductsRepository productsRepository;

  @Autowired
  private UsersRepository userRepository;

  @GetMapping("/cart")
  public String cartPage(Principal principal, Model model) {

    Users user = this.userRepository.findByEmail(principal.getName());
    model.addAttribute("cartItems", user.getCartItems());
    model.addAttribute("cartTotal", this.userRepository.getCartTotal(user.getUserID()));
    model.addAttribute("cartItemCount", this.userRepository.getCartItemCount(user.getUserID()));

    return "cart";
  }

  @PostMapping("/cart")
  public String addToCart(@RequestParam(value = "productID") UUID productId, @RequestParam(value = "size") String size,
      @RequestParam(value = "quantity") short quantity, Principal principal, Model model) {

    Users user = this.userRepository.findByEmail(principal.getName());
    Products product = this.productsRepository.findByProductID(productId);

    Cart cart = this.cartRepository.findByUserAndProductAndSize(user, product, size);

    if (cart == null) {
      cart = new Cart();
      cart.setUser(user);
      cart.setProduct(product);
      cart.setSize(size);
      cart.setQuantity(quantity);
      user.addItemToCart(cart);
    } else {
      //apparently short + short = int, who knew?
      short newQuantity = (short)(quantity + cart.getQuantity());
      cart.setQuantity(newQuantity);
    }
    this.userRepository.save(user);

    return this.cartPage(principal, model);
  }

  @PostMapping("/removeFromCart")
  public String removeFromCart(@RequestParam(value = "productID") UUID productId,
      @RequestParam(value = "size") String size, Principal principal, Model model) {

    Users user = this.userRepository.findByEmail(principal.getName());
    Products product = this.productsRepository.findByProductID(productId);
    Cart cart = this.cartRepository.findByUserAndProductAndSize(user, product, size);

    this.cartRepository.delete(cart);

    return this.cartPage(principal, model);
  }
}
