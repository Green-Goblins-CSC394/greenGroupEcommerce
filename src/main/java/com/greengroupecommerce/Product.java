package com.greengroupecommerce;

public class Product {
  public String image;
  public String name;
  public String description;
  public String price;

  public Product(String picturePath, String name, String description, String price) {
    this.image = picturePath;
    this.name = name;
    this.description = description;
    this.price = price;
  }

  
}
