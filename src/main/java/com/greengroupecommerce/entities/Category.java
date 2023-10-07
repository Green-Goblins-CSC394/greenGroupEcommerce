package com.greengroupecommerce.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "category_id")
	private UUID categoryID;

  @Column(name = "category_name")
	private String categoryName;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
  private List<Products> products;

  //Getters and Setters
  public UUID getCategoryID() {
    return categoryID;
  }

  public void setCategoryID(UUID categoryID) {
    this.categoryID = categoryID;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
}
