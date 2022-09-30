package com.lti.exception;

public class NoSuchCourseException extends Exception{

	public NoSuchCourseException() {
		super("No Such Course Found");
	}
}
