package com.greengroupecommerce.entities;

import java.util.UUID;
import java.math.BigDecimal;
import java.sql.Timestamp;

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
@Getter
@Setter
@Table(name = "`Products`")
public class Products {

  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "product_id")
	private UUID productID;

  @Column(name = "product_name")
	private String productName;

	@Column(name = "price")
	private BigDecimal price;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
	private Category category;

  @Column(name = "created_at")
	private Timestamp createdAt;

  @Column(name = "image_path")
	private String imagePath;

  @Column(name = "description")
	private String description;

	@Column(name = "stripe_product_id")
	private String stripeProductId;

}
