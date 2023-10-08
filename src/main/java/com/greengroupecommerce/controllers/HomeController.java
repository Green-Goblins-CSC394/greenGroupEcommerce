package com.greengroupecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.greengroupecommerce.entities.Products;
import com.greengroupecommerce.repositories.ProductsRepository;

@Controller
public class HomeController {
  public HomeController() {}

  @Autowired
  private ProductsRepository productsRepository;

  @GetMapping("/")
    public String homePage(Model model) {
      List<Products> products = productsRepository.findTop4ByOrderByCreatedAtDesc();
      model.addAttribute("products", products);
      return "home";
    }
    
}
