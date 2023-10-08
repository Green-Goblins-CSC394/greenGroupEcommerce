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
@Table(name = "`Products`")
public class Products {

  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "product_id")
  @Getter
	@Setter
	private UUID productID;

  @Column(name = "product_name")
  @Getter
	@Setter
	private String productName;

	@Column(name = "price")
  @Getter
	@Setter
	private BigDecimal price;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id")
  @Getter
	@Setter
	private Category category;

  @Column(name = "created_at")
  @Getter
	@Setter
	private Timestamp createdAt;

  @Column(name = "image_path")
  @Getter
	@Setter
	private String imagePath;

  @Column(name = "description")
  @Getter
	@Setter
	private String description;

}
