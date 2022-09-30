package com.lti.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CourseRequestRepository;
import com.lti.entity.CourseRequest;
import com.lti.exception.NoSuchCourseException;

@Service
public class CourseRequestServiceImpl implements CourseRequestService {

	@Autowired	
	private CourseRequestRepository courseRepo;
	
	@Override
	@Transactional
	public CourseRequest addRequest(CourseRequest cr) {
		return this.courseRepo.save(cr);
	}

	@Override
	public CourseRequest getStatus(int id) throws NoSuchCourseException {
		Optional<CourseRequest> course = this.courseRepo.findById(id);
		if(course.isPresent()) {
			return course.get();
		}else {
			throw new NoSuchCourseException();
		}
	}

	@Override
	public List<CourseRequest> getAll() {
		return this.courseRepo.findAll();
	}
}
