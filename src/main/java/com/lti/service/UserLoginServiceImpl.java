package com.lti.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UserRegisterRepository;
import com.lti.entity.UserRegistration;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired
	private UserRegisterRepository userRepo;

	
	public boolean validateUser(String username, String password) {
		Optional<UserRegistration> temp = this.userRepo.findByUserNamePassword(username, password);
		if(temp.isPresent()) {
			return true;
		}else {
			return false;
		}
	}
}
