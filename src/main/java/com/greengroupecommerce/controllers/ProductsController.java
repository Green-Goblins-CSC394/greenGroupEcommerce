package com.greengroupecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.greengroupecommerce.Product;

@Controller
public class ProductsController {
  public ProductsController() {}

  @GetMapping("/products")
    public String productsPage(@RequestParam(value="category") String category, Model model) {
      Product[] products = new Product[2];
      if (category.equals("men")) {
        products[0] = new Product("/images/menKiwi.avif", "mKiwi", "Products's Cotton Crew Neck Short-Sleeve T-Shirt", "$19.90");
        products[1] = new Product("/images/menForest.jpg", "mForest", "Products's Cotton Oversized Crew Neck Short-Sleeve T-Shirt", "$29.90");
      }
      else if (category.equals("women")) {
        products[0] = new Product("/images/womenKiwi.avif", "wKiwi", "Products's Cotton Crew Neck Short-Sleeve T-Shirt", "$19.90");
        products[1] = new Product("/images/womenForest.jpg", "wForest", "Products's Cotton Oversized Crew Neck Short-Sleeve T-Shirt", "$29.90");
      } 
      else if (category.equals("kids")) {
        products[0] = new Product("/images/kidsKiwi.avif", "kKiwi", "Products's Cotton Crew Neck Short-Sleeve T-Shirt", "$19.90");
        products[1] = new Product("/images/kidsForest.jpg", "kForest", "Products's Cotton Oversized Crew Neck Short-Sleeve T-Shirt", "$29.90");
      }
      model.addAttribute("products", products);
      return "products";
    }

    @GetMapping("/products/{product}")
    public String productPage(@PathVariable("product") String product, Model model) {
      Product myProduct;
      if (product.equals("mKiwi")) {
        myProduct = new Product("/images/menKiwi.avif", "mKiwi", "Products's Cotton Crew Neck Short-Sleeve T-Shirt", "$19.90");
      } else {
        myProduct = new Product("/images/womenKiwi.avif", "wKiwi", "Products's Cotton Crew Neck Short-Sleeve T-Shirt", "$19.90");
      }
      model.addAttribute("product", myProduct);
      return "product";
    }
    
}