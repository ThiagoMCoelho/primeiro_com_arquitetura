package com.fullfire.tech.primeiroarquitetura.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullfire.tech.primeiroarquitetura.domain.User;
import com.fullfire.tech.primeiroarquitetura.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User find(Integer id) {
		User obj = userRepo.findOne(id);
		return obj;
	}
		
}
