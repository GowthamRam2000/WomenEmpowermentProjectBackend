package com.lti.service;

import java.util.List;

import com.lti.entity.CourseRequest;
import com.lti.exception.NoSuchCourseException;

public interface CourseRequestService {
	public CourseRequest addRequest(CourseRequest cr);
	public CourseRequest getStatus(int id) throws NoSuchCourseException;
	public List<CourseRequest> getAll();
}
