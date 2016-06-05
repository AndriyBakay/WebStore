package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.service.UniqueUserName;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@UniqueUserName (message = "Даний логін вже використовується")
	private String login;
	private String password;
	@Enumerated(EnumType.ORDINAL)
	private Role role;
	private String emailAdress;
	private String phoneNamber;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<OrderProduct> order;

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPhoneNamber() {
		return phoneNamber;
	}

	public void setPhoneNamber(String phoneNamber) {
		this.phoneNamber = phoneNamber;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<OrderProduct> getOrder() {
		return order;
	}

	public void setOrder(List<OrderProduct> order) {
		this.order = order;
	}

}
