package com.kimisoft.cineManager.service;

import java.util.List;

import com.kimisoft.cineManager.model.User;

public interface UserService {

	User findById(Long id);
	User findByUsername(String name);
	void saveUser(User user);
	void deleteUserById(Long id);
	void updateUser(User user);
	List<User> findAllUsers();
	public boolean isUserExist(User user);
	
}
