package com.lti.service;

import com.lti.entity.UserFullData;
import com.lti.exception.NoSuchUserException;

public interface UserFullDataService {
	public void addUser(UserFullData ufd);
	public UserFullData getUser(String username) throws NoSuchUserException;
}
