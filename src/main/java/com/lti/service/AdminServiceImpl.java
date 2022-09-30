package com.lti.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.AdminRepository;
import com.lti.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepo;

	@Override
	@Transactional
	public void addNewAdmin(Admin admin) {
		this.adminRepo.save(admin);
	}

	@Override
	public boolean isValidAdmin(String username, String password) {
		Optional<Admin> opt = this.adminRepo.isAdminValid(username, password);
		
		if(opt.isPresent()) {
			return true;
		}else {
			return false;
		}
	}
}
