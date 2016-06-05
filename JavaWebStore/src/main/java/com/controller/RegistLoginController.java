package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.User;
import com.service.UserService;

@Controller
public class RegistLoginController {
	@Autowired
	UserService userServise;

	@RequestMapping("/registration")
	public String showRegistration() {
		return "registration";
	}

	@ModelAttribute("user")
	public User setUser() {
		return new User();
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute User user, BindingResult br) {
		if (br.hasErrors()) {
			return "registration";
		}
		userServise.saveUser(user);
		return "redirect:/";
	}

	// @RequestMapping(value = "/registration", method = RequestMethod.POST)
	// public String registration(@RequestParam String firstName,@RequestParam
	// String lastName,@RequestParam String email,
	// @RequestParam String tel,@RequestParam String password,@RequestParam
	// String username){
	// service.saveClient(firstName, lastName,email,tel,username,password);
	//
	// return "redirect:/";
	// }

	// public String email(Model model){
	// model.addAttribute("client",service.getAll());
	// return "registration";
	// }
	@RequestMapping("/signIn")
	public String view() {
		return "signIn";
	}

	@RequestMapping("/logout")
	// SIGN OUT!!!!!
	public String logout() {
		SecurityContextHolder.getContext().setAuthentication(null);
		return "redirect:/";
	}

}
