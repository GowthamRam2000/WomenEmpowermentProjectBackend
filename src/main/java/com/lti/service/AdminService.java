package com.lti.service;

import com.lti.entity.Admin;

public interface AdminService {
	public void addNewAdmin(Admin admin);
	public boolean isValidAdmin(String username, String password);
}
