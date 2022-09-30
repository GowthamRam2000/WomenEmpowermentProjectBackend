package com.lti.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.NgoRegisterRepository;
import com.lti.entity.NgoRegistration;

@Service
public class NgoRegisterServiceImpl implements NgoRegisterService {

	@Autowired
	private NgoRegisterRepository ngoRepo;
	
	@Override
	@Transactional
	public void addNgo(NgoRegistration ngoReg) {
		this.ngoRepo.save(ngoReg);
	}

	@Override
	public boolean ngoExists(String username) {
		Optional<NgoRegistration> temp = this.ngoRepo.findById(username);
		
		if(temp.isPresent()) {
			return true;
		}else {
			return false;
		}
	}
}
