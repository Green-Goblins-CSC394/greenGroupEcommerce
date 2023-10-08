package com.greengroupecommerce.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greengroupecommerce.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID>{
  public Category findByCategoryName(String categoryName);
}
