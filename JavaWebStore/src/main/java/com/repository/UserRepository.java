package com.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("select u from User u where u.login = :login")
	User findByUsername(@Param("login")String username);
	
	@Query("select u from User u where u.emailAdress = :emailAdress")
	User findByEmail(@Param("emailAdress")String emailAdress);
	
	
}
