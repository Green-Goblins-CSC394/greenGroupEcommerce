package com.greengroupecommerce.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greengroupecommerce.entities.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, UUID>{
  public Products findByProductID(UUID productID);
  public List<Products> findTop4ByOrderByCreatedAtDesc();
}
