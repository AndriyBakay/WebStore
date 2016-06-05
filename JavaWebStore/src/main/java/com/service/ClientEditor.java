package com.service;

import java.beans.PropertyEditorSupport;

public class ClientEditor extends PropertyEditorSupport {
	
	private final UserService userService;
	
	public ClientEditor(UserService userService){
		this.userService = userService;
	}
	public void setAsText(int id) throws IllegalArgumentException{
		setValue(userService.findById(id));
	}

}
