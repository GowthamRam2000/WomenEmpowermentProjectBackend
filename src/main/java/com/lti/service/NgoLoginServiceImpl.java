package com.lti.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.NgoRegisterRepository;
import com.lti.entity.NgoRegistration;

@Service
public class NgoLoginServiceImpl implements NgoLoginService {
	
	@Autowired
	private NgoRegisterRepository ngoRepo;

	@Override
	public boolean validateUser(String username, String password) {
		Optional<NgoRegistration> temp = this.ngoRepo.findByUserNamePassword(username, password);
		if(temp.isPresent()) {
			return true;
		}else {
			return false;
		}
	}
}
