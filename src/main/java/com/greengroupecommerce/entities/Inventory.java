package com.greengroupecommerce.entities;

import java.util.UUID;

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
@Table(name = "Inventory")
public class Inventory {
  
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "inventory_id")
	private UUID inventoryID;

  @Column(name = "size")
	private String size;

  @Column(name = "remaining_stock")
	private short remainingStock;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "product_id")
	private Products product;

  //Getters and Setters
  public UUID getInventoryID() {
    return inventoryID;
  }

  public void setInventoryID(UUID inventoryID) {
    this.inventoryID = inventoryID;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public short getRemainingStock() {
    return remainingStock;
  }

  public void setRemainingStock(short remainingStock) {
    this.remainingStock = remainingStock;
  }

  public Products getProduct() {
    return product;
  }

  public void setProduct(Products product) {
    this.product = product;
  }
}
