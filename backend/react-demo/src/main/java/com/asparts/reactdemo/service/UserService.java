package com.asparts.reactdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asparts.reactdemo.model.User;
import com.asparts.reactdemo.repository.UserRepository;

@Service
@Transactional
public class UserService {

	/*
	 * Create a User service class to code the business logic and it acts as a middle layer between repository and controller class.
	 * @Transactional used to annotate methods are executed in transactions.
	 * */
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> listAllUser(){
		return userRepository.findAll();
	}
	public void saveUser(User user) {//TODO: WTF?? 
		userRepository.save(user);
		
	}
	public User getUser(Integer id) {
		return userRepository.findById(id).get();
	}
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
}
