package com.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WomenController {
  public WomenController() {}

  @GetMapping("/women")
    public String womenPage(Model model) {
      return "women";
    }
    
}