package com.greengroupecommerce.entities;

import java.util.UUID;
import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Products {

  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "product_id")
	private UUID productID;

  @Column(name = "product_name")
	private String productName;

	@Column(name = "price")
	private BigDecimal price;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
	private Category category;

  @Column(name = "created_at")
	private Timestamp createdAt;

  //Getters and Setters
  public UUID getProductID() {
    return productID;
  }

  public void setProductID(UUID productID) {
    this.productID = productID;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  
}
