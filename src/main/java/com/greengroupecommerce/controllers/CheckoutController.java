package com.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckoutController {
  public CheckoutController() {
  }

  @GetMapping("/checkout")
  public String checkoutPage(Model model) {
    return "checkout";
  }

}
