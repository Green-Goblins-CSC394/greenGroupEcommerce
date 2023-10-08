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
@Table(name = "`Users`")
public class Users {

  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "user_id")
  @Getter
	@Setter
	private UUID userID;

  @Column(name = "email")
  @Getter
	@Setter
	private String email;

	@Column(name = "password")
  @Getter
	@Setter
	private String password;

	@Column(name = "created_at")
  @Getter
	@Setter
	private Timestamp createdAt;
  
	@Column(name = "last_login")
  @Getter
	@Setter
	private Timestamp lastLogin;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
  @Getter
	@Setter
  private List<Orders> orders;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
  @Getter
	@Setter
  private List<Cart> cartItems;
}
