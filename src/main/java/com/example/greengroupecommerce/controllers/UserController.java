package com.example.greengroupecommerce.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
  public UserController() {}

  @GetMapping("/user")
    public String userPage(Model model) {
      return "user";
    }

}