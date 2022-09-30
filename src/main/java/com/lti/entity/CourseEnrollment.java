package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseEnrollment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int enrollid;

	private String username;
	private int courseId;

	public int getEnrollid() {
		return enrollid;
	}

	public void setEnrollid(int enrollid) {
		this.enrollid = enrollid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
}
