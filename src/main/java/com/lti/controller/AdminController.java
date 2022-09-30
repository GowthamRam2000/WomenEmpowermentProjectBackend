package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Admin;
import com.lti.entity.Login;
import com.lti.service.AdminService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admin")
	public void post(@RequestBody() Admin admin) {
		this.adminService.addNewAdmin(admin);
	}
	
	@PostMapping("/valid-admin")
	public boolean isValid(@RequestBody() Login login) {
		return this.adminService.isValidAdmin(login.getUsername(), login.getPassword());
	}
}
