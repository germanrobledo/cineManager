package com.kimisoft.cineManager.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimisoft.cineManager.model.User;
import com.kimisoft.cineManager.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findById(Long id) {
		Optional<User> result = userRepository.findById(id);
		if(result.isPresent()){
			return result.get();
		}
		else{
			return null;			
		}
	}

	@Override
	public User findByUsername(String name) {
		
		return userRepository.findByUsername(name);
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
		
	}

	@Override
	public List<User> findAllUsers() {
		Iterable<User> allUsers = userRepository.findAll();
		ArrayList<User> resultList = new ArrayList<User>();
		allUsers.forEach(resultList::add);
		return resultList;
	}

	@Override
	public boolean isUserExist(User user) {
		User resultUser = userRepository.findByUsername(user.getUsername());
		if(resultUser != null)
			return true;
		return false;
	}

}
