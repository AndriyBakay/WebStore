package com.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class OrderProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int OrderProductId;
	
	@Column(name = "orderNumber")
	private int orderNumber;
	@Column(name = "orderData")
	private Date orderData;
	@ManyToOne
	private User user;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "orderProduct")
	private List<OrderDetails> orderDetails;  
	

	

	public int getOrderProductId() {
		return OrderProductId;
	}

	public void setOrderProductId(int orderProductId) {
		OrderProductId = orderProductId;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderData() {
		return orderData;
	}

	public void setOrderData(Date orderData) {
		this.orderData = orderData;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	
	
	
}
