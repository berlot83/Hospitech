package com.molokotech.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.molokotech.model.User;
import com.molokotech.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User create(User user) {
		return userRepository.save(user);
	}
	
	public User read(Long id) {
		return userRepository.getOne(id);
	}
	
	public List<User> readAll(){
		return userRepository.findAll();
	}
	
	public User readByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	public List<User> readByIsActive(boolean isActive){
		return userRepository.findByIsActive(isActive);
	}
}
