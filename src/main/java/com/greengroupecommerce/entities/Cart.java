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
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`Cart`")
public class Cart {

  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "cart_id")
	@Getter
	@Setter
	private UUID cartID;

	@ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
	@Getter
	@Setter
	private Users user;
  
	@ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "product_id")
	@Getter
	@Setter
	private Products product;

	@Column(name = "size")
	@Getter
	@Setter
	private String size;
  
	@Column(name = "quantity")
	@Getter
	@Setter
	private short quantity;
}
