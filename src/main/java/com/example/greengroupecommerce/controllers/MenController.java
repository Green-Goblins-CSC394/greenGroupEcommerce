package com.example.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenController {
  public MenController() {}

  @GetMapping("/men")
    public String menPage(Model model) {
      return "men";
    }
    
}