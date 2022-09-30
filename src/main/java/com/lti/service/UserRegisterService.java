package com.lti.service;

import com.lti.entity.UserRegistration;

public interface UserRegisterService {
	public void registerUser(UserRegistration ur);
	public boolean isUsernamePresent(String username);
}
