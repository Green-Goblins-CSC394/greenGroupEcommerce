package com.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfirmationController {
  public ConfirmationController() {
  }

  @GetMapping("/confirmation")
  public String confirmationPage(Model model) {
    return "confirmation";
  }
  
}
