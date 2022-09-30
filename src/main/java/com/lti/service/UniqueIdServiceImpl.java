package com.lti.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.UniqueIdRepository;
import com.lti.entity.UniqueId;

@Service
public class UniqueIdServiceImpl implements UniqueIdService {
	@Autowired
	private UniqueIdRepository repo;

	@Override
	public int getRegId() {
		Optional<UniqueId> id = this.repo.findById(1);
		if(id.isPresent()) {
			return id.get().getRegId();
		}
		return 0;
	}

	@Override
	@Transactional
	public void updateRegId() {
		int currId = this.getRegId();
		UniqueId uid = new UniqueId();
		uid.setId(1);
		uid.setRegId(currId+1);
		this.repo.save(uid);
	}
	
	@Transactional
	public void addEntry() {
		UniqueId id = new UniqueId();
		id.setId(1);
		id.setRegId(1);
		this.repo.save(id);
	}
}
