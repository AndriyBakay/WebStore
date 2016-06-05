package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.repository.ProductRepository;

public class ProductServise {
	@Autowired
	private ProductRepository productRepository;
}
