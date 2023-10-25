package com.greengroupecommerce.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "`Orders`")
public class Orders {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "order_id")
	private UUID orderID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private Users user;
  
  @Column(name = "transaction_price")
	private BigDecimal transactionPrice;

  @Column(name = "tracking_number")
	private String trackingNumber;

  @Column(name = "completed_at")
	private Timestamp completedAt;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "order", cascade = CascadeType.ALL)
  private List<OrderItems> orderItems = new ArrayList<OrderItems>();

	public void addOrderItemToOrder(OrderItems orderItem) {
		this.orderItems.add(orderItem);
	}

	public String getCompletedAt() {
		return new SimpleDateFormat("MM/dd/yyyy").format(this.completedAt);
	}
}
