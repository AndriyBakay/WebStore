package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="OrderDetails")
public class OrderDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "totalPrice")
	private int totalPrice;
	@ManyToOne
	private OrderProduct orderProduct;
	@ManyToOne
	private Product product;
	
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public OrderProduct getOrderProduct() {
		return orderProduct;
	}


	public void setOrderProduct(OrderProduct orderProduct) {
		this.orderProduct = orderProduct;
	}


	
	
	

}
