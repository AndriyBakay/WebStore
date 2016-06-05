package com.service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.repository.UserRepository;


public class UserNameValidator implements ConstraintValidator<UniqueUserName, String>{
	
	@Autowired
	private UserRepository userRepository;
	public void initialize(UniqueUserName arg0) {
		
	}

	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		if (userRepository==null) 
			return true;
		return userRepository.findByUsername(arg0)==null;
	}
}
