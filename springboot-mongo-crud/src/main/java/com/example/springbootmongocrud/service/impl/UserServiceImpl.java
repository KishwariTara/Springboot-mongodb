package com.example.springbootmongocrud.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootmongocrud.entity.User;
import com.example.springbootmongocrud.repository.UserRepository;
import com.example.springbootmongocrud.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
    @Autowired
    private UserRepository userRepository;
    
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(Long id, User user) {
		Optional<User> findById = userRepository.findById(id);
		if(findById.isPresent()) {
			User userEntity = findById.get();
		}else {
			throw new RuntimeException("User not found for id::" +id);
			
		} 
		return user;
	}

	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
		
	}

}
