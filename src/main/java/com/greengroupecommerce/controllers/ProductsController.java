package com.greengroupecommerce.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.greengroupecommerce.entities.Category;
import com.greengroupecommerce.entities.Products;
import com.greengroupecommerce.repositories.CategoryRepository;
import com.greengroupecommerce.repositories.ProductsRepository;

@Controller
public class ProductsController {
  public ProductsController() {}

  @Autowired
  private CategoryRepository categoryRepository;

  @Autowired
  private ProductsRepository productsRepository;

  @GetMapping("/products")
    public String productsPage(@RequestParam(value="category") String categoryName, Model model) {
      Category category = this.categoryRepository.findByCategoryName(categoryName);
      model.addAttribute("products", category.getProducts());
      model.addAttribute("pageTitle", category.getCategoryName());
      return "products";
    }

    @GetMapping("/products/{product}")
    public String productPage(@PathVariable("product") String product, Model model) {
      Products myProduct = this.productsRepository.findByProductID(UUID.fromString(product));
      model.addAttribute("product", myProduct);
      return "product";
    }  
}