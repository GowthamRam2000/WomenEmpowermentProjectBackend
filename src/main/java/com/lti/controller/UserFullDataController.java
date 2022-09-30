package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.UserFullData;
import com.lti.exception.NoSuchUserException;
import com.lti.service.UserFullDataServiceImpl;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserFullDataController {

	@Autowired
	private UserFullDataServiceImpl userService;
	
	@PostMapping("/user")
	public void add(@RequestBody() UserFullData ufd) {
		this.userService.addUser(ufd);
	}
	
	@GetMapping("/user/{username}")
	public UserFullData get(@PathVariable("username") String username) {
		UserFullData ufd;
		try {
			ufd = this.userService.getUser(username);
		}catch(NoSuchUserException e) {
			ufd = new UserFullData();
		}
		
		return ufd;
	}
}
