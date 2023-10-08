package com.greengroupecommerce.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
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
@Table(name = "`Orders`")
public class Orders {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "order_id")
	@Getter
	@Setter
	private UUID orderID;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@Getter
	@Setter
	private Users user;
  
  @Column(name = "transaction_price")
	@Getter
	@Setter
	private BigDecimal transactionbPrice;

  @Column(name = "tracking_number")
	@Getter
	@Setter
	private String trackingNumber;

  @Column(name = "completed_at")
	@Getter
	@Setter
	private Timestamp completedAt;
	

}
