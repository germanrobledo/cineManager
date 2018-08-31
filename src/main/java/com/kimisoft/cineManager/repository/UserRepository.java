package com.kimisoft.cineManager.repository;

import org.springframework.data.repository.CrudRepository;

import com.kimisoft.cineManager.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByUsername(String name);
}
