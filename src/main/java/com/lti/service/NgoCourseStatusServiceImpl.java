package com.lti.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.NgoCourseStatusRepository;
import com.lti.entity.NgoCourseStatus;
import com.lti.exception.NoSuchRegistrationException;

@Service
public class NgoCourseStatusServiceImpl implements NgoCourseStatusService {
	
	@Autowired
	private NgoCourseStatusRepository courseRepo;

	@Transactional
	public NgoCourseStatus updateCourseStatus(NgoCourseStatus status) {
		return this.courseRepo.save(status);
	}

	@Override
	public NgoCourseStatus getStatus(int id) throws NoSuchRegistrationException {
		Optional<NgoCourseStatus> opt = this.courseRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new NoSuchRegistrationException();
		}
	}

	@Override
	public List<NgoCourseStatus> getAll() {
		return this.courseRepo.findAll();
	}
}
