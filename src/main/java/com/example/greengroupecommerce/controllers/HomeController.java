package com.example.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  public HomeController() {}

  @GetMapping("/")
    public String homePage(Model model) {
      //replace "test" with the name of the html file you want to use as a landing page
      return "test";
    }
}
