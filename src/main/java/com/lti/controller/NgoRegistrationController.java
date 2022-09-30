package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.NgoRegistration;
import com.lti.service.NgoRegisterService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class NgoRegistrationController {
	@Autowired
	private NgoRegisterService ngoService;
	
	@PostMapping("/ngo-register")
	public void addNgo(@RequestBody() NgoRegistration ngoReg) {
		this.ngoService.addNgo(ngoReg);
	}
	
	@GetMapping("/ngo-present/{username}")
	public boolean exists(@PathVariable("username") String username) {
		return this.ngoService.ngoExists(username);
	}
}
