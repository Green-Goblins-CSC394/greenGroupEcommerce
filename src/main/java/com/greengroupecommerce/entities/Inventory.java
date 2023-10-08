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
@Table(name = "`Inventory`")
public class Inventory {
  
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "inventory_id")
  @Getter
	@Setter
	private UUID inventoryID;

  @Column(name = "size")
  @Getter
	@Setter
	private String size;

  @Column(name = "remaining_stock")
  @Getter
	@Setter
	private short remainingStock;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "product_id")
  @Getter
	@Setter
	private Products product;

}
