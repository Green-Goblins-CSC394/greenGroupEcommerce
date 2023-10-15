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
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "`Users`")
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
}
