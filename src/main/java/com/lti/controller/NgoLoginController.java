package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Login;
import com.lti.service.NgoLoginService;
import com.lti.service.UserLoginService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class NgoLoginController {
	@Autowired
	private NgoLoginService loginService;
	
	@PostMapping("/ngo-login")
	public boolean isValid(@RequestBody() Login login) {
		return this.loginService.validateUser(login.getUsername(), login.getPassword());
	}
}
