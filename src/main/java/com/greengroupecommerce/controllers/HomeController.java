package com.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  public HomeController() {}

  @GetMapping("/")
    public String homePage(Model model) {
      return "home";
    }
    
}
