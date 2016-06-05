package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.entity.Role;
import com.entity.User;
import com.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	public void saveUser(User user) {
		user.setLogin(user.getLogin());
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setEmailAdress(user.getEmailAdress());
		user.setPhoneNamber(user.getPhoneNamber());
		user.setRole(Role.ROLE_USER);
		userRepository.save(user);
	}

	public User findById(int id) {
		return userRepository.findOne(id);
	}

	public Iterable<User> getAll() {
		return userRepository.findAll();
	}
	public void save(String login, String phoneNamber, String emailAdress, String password){
		User user = new User();
		user.setLogin(login);;
		user.setPassword(bCryptPasswordEncoder.encode(password));
		user.setRole(Role.ROLE_USER);
		user.setEmailAdress(emailAdress);
		user.setPhoneNamber(phoneNamber);
		userRepository.save(user);
	}

	public void delete(String id) {
		try {
			int idParse = Integer.parseInt(id);
			userRepository.delete(idParse);
		} catch (NumberFormatException e) {

		}

	}

}
