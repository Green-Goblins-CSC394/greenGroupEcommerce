package com.greengroupecommerce.controllers;


import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.greengroupecommerce.entities.Users;
import com.greengroupecommerce.repositories.UsersRepository;

@Controller
public class UserController {
  public UserController() {}

  @Autowired
  private UsersRepository userRepository;

  @GetMapping("/user")
    public String userPage(Principal principal, Model model) {
      Users user = this.userRepository.findByEmail(principal.getName());
      model.addAttribute("orderList", user.getOrders());
      System.out.println(user.getOrders().size());
      return "user";
    }
}