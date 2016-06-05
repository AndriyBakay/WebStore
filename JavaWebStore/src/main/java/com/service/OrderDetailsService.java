package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.repository.OrderDetailsRepository;

public class OrderDetailsService {
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
}
