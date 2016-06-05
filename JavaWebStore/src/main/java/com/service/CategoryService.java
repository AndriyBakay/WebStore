package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.repository.CategoryRepository;

public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

}
