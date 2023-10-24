package com.greengroupecommerce.repositories;

import org.springframework.stereotype.Repository;

import com.greengroupecommerce.entities.Users;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UsersRepository extends JpaRepository<Users, UUID>{
  public Users findByEmail(String email);

  @Query(value="SELECT SUM(c.quantity * p.price) FROM \"Cart\" c left join \"Products\" p on c.product_id = p.product_id WHERE c.user_id = :userID", nativeQuery = true)
	public BigDecimal getCartTotal(@Param("userID") UUID userID);

  @Query(value="SELECT SUM(quantity) FROM \"Cart\" WHERE user_id = :userID", nativeQuery = true)
	public BigDecimal getCartItemCount(@Param("userID") UUID userID);
}
