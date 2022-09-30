package com.lti.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UserRegisterRepository;
import com.lti.entity.UserRegistration;

@Service
public class UserRegisterServiceImpl implements UserRegisterService{
	@Autowired
	private UserRegisterRepository regRepo;
	
	@Transactional
	public void registerUser(UserRegistration userReg) {
		this.regRepo.save(userReg);
	}

	public boolean isUsernamePresent(String username) {
		Optional<UserRegistration> userReg = this.regRepo.findById(username);
		if(userReg.isPresent()) {
			return true;
		}
		return false;
	}
}
