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

@Entity
@Table(name = "Orders")
public class Orders {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "order_id")
	private UUID orderID;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private Users user;
  
  @Column(name = "transaction_price")
	private BigDecimal transactionbPrice;

  @Column(name = "tracking_number")
	private String trackingNumber;

  @Column(name = "completed_at")
	private Timestamp completedAt;

	//Getters and Setters
	public UUID getOrderID() {
		return orderID;
	}

	public void setOrderID(UUID orderID) {
		this.orderID = orderID;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public BigDecimal getTransactionbPrice() {
		return transactionbPrice;
	}

	public void setTransactionbPrice(BigDecimal transactionbPrice) {
		this.transactionbPrice = transactionbPrice;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public Timestamp getCompletedAt() {
		return completedAt;
	}

	public void setCompletedAt(Timestamp completedAt) {
		this.completedAt = completedAt;
	}

	

}
