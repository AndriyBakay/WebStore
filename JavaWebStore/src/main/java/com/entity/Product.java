package com.entity;
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
public class Product {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int productID;
		@Column(name = "productName")
		private String productName;
		@Column(name = "productPrice")
		private int productPrice;
		@Column(name = "productPicture")
		private String productPicture;
		@Column(name = "productDescription")
		private String productDescription;
		@ManyToOne
		private Category category;
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
		private List<OrderDetails> orderDetails;

		public int getProductID() {
			return productID;
		}

		public void setProductID(int productID) {
			this.productID = productID;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public int getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}

		public String getProductPicture() {
			return productPicture;
		}

		public void setProductPicture(String productPicture) {
			this.productPicture = productPicture;
		}

		public String getProductDescription() {
			return productDescription;
		}

		public void setProductDescription(String productDescription) {
			this.productDescription = productDescription;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public List<OrderDetails> getOrderDetails() {
			return orderDetails;
		}

		public void setOrderDetails(List<OrderDetails> orderDetails) {
			this.orderDetails = orderDetails;
		}
		
		
}
