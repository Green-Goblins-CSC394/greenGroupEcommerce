package com.example.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
  public CartController() {}

  @GetMapping("/cart")
    public String cartPage(Model model) {
      return "cart";
    }

}

