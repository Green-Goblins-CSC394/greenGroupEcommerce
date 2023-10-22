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
@Getter
@Setter
@Table(name = "`OrderItems`")
public class OrderItems {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "order_item_id")
  private UUID orderItemID;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "order_id")
	private Orders order;
  
	@ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "product_id")
	private Products product;

  @Column(name = "size")
	private String size;
  
	@Column(name = "quantity")
	private short quantity;
}
