package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.UserRegistration;
import com.lti.service.UserRegisterService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserRegistrationController {
	@Autowired
	private UserRegisterService regService;
	
	@PostMapping("/user-registration")
	public void add(@RequestBody() UserRegistration userReg) {
		this.regService.registerUser(userReg);
	}
	
	@GetMapping("/user-present/{username}")
	public boolean exists(@PathVariable("username") String username) {
		return this.regService.isUsernamePresent(username);
	}
}
