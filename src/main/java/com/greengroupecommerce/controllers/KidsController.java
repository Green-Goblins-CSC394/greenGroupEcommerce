package com.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KidsController {
  public KidsController() {}

  @GetMapping("/kids")
    public String kidPage(Model model) {
      return "kids";
    }
    
}