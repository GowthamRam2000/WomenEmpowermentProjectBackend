package com.lti.service;

import java.util.List;

import com.lti.entity.NgoCourseStatus;
import com.lti.exception.NoSuchRegistrationException;

public interface NgoCourseStatusService {
	public NgoCourseStatus updateCourseStatus(NgoCourseStatus status);
	public NgoCourseStatus getStatus(int id) throws NoSuchRegistrationException;
	public List<NgoCourseStatus> getAll();
}
