package com.lti.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UserFullDataRepository;
import com.lti.entity.UserFullData;
import com.lti.exception.NoSuchUserException;

@Service
public class UserFullDataServiceImpl implements UserFullDataService {
	
	@Autowired
	private UserFullDataRepository userRepo;
	
	@Transactional
	public void addUser(UserFullData ufd) {
		this.userRepo.save(ufd);
	}

	public UserFullData getUser(String username) throws NoSuchUserException {
		Optional<UserFullData> opt = this.userRepo.findById(username);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new NoSuchUserException();
		}
	}
}
