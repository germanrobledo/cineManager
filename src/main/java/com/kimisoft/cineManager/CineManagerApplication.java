package com.kimisoft.cineManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CineManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CineManagerApplication.class, args);
	}
	
//	@Bean
//	 public BCryptPasswordEncoder bCryptPasswordEncoder() {
//	  return new BCryptPasswordEncoder();
//	 }
}
