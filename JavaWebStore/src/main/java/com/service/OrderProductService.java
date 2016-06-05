package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.repository.OrderProductRepository;

public class OrderProductService {
	
	@Autowired
	private OrderProductRepository orderProductRepository;

}
