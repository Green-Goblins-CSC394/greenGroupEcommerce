package com.example.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
  public ProductController() {}

  @GetMapping("/product")
    public String productPage(Model model) {
      return "product";
    }
    
}