package com.greengroupecommerce.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greengroupecommerce.entities.Cart;
import com.greengroupecommerce.entities.Products;
import com.greengroupecommerce.entities.Users;

@Repository
public interface CartRepository extends JpaRepository<Cart, UUID> {
  public Cart findByUserAndProductAndSize(Users user, Products product, String size);
}
