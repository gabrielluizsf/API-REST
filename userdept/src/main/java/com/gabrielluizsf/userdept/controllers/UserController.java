package com.gabrielluizsf.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielluizsf.userdept.entities.User;
import com.gabrielluizsf.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value ="/users")
public class UserController {
	@Autowired
 private UserRepository repository;
	
	//Print All Users 
	@GetMapping
	public List<User>seeAll(){
		List<User> result = repository.findAll();
		return result;
			
		
	}
	//print 1 User
	@GetMapping(value="/{id}")
	public User findUser(@PathVariable Long id){
		User result = repository.findById(id).get();
		return result;
			
		
	}
	//print 1 User
	@PostMapping
	public User insert(@RequestBody User user){
		User result = repository.save(user);
		return result;
			
		
	}
}
