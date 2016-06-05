package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryID;
	@Column(name = "categoryName")
	private String categoryName;
	@Column(name = "catDescription")
	private String catDescription;
	@Column(name = "catPicture")
	private String catPicture;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
	private List<Product> product;

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCatDescription() {
		return catDescription;
	}

	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}

	public String getCatPicture() {
		return catPicture;
	}

	public void setCatPicture(String catPicture) {
		this.catPicture = catPicture;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

}
