package com.lti.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.NgoFullDataRepository;
import com.lti.entity.NgoFullData;
import com.lti.exception.NoSuchNgoException;

@Service
public class NgoFullDataServiceImpl implements NgoFullDataService {

	private static final String Optional = null;
	@Autowired
	private NgoFullDataRepository ngoRepo;
	
	@Transactional
	public void addNgoData(NgoFullData fullData) {
		this.ngoRepo.save(fullData);
	}

	@Override
	public NgoFullData getFullData(String username) throws NoSuchNgoException {
		Optional<NgoFullData> data = this.ngoRepo.findById(username);
		if(data.isPresent()) {
			return data.get();
		}else {
			throw new NoSuchNgoException();
		}
	}
}
