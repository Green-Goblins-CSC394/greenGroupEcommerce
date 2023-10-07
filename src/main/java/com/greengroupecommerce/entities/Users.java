package com.greengroupecommerce.entities;

import java.util.List;
import java.util.UUID;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {

  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "user_id")
	private UUID userID;

  @Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "created_at")
	private Timestamp createdAt;
  
	@Column(name = "last_login")
	private Timestamp lastLogin;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
  private List<Orders> orders;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
  private List<Cart> cartItems;

  // Getters and Setters
  public UUID getUserID() {
    return userID;
  }

  public void setUserID(UUID userID) {
    this.userID = userID;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
  }

  public Timestamp getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(Timestamp lastLogin) {
    this.lastLogin = lastLogin;
  } 
}
