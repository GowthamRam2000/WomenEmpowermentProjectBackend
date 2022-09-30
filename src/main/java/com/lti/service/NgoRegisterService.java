package com.lti.service;

import com.lti.entity.NgoRegistration;

public interface NgoRegisterService {
	public void addNgo(NgoRegistration ngoReg);
	public boolean ngoExists(String username);
}
