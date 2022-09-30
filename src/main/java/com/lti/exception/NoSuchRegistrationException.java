package com.lti.exception;

public class NoSuchRegistrationException extends Exception{
	
	public NoSuchRegistrationException() {
		super("No such registration");
	}
}
