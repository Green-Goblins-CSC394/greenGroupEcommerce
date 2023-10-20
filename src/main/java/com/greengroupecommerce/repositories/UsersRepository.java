package com.greengroupecommerce.repositories;

import org.springframework.stereotype.Repository;

import com.greengroupecommerce.entities.Users;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsersRepository extends JpaRepository<Users, UUID>{
  public Users findByEmail(String email);
}
