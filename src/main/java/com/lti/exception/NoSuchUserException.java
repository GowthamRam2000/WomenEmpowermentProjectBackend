package com.lti.exception;

public class NoSuchUserException extends Exception{
	public NoSuchUserException() {
		super("No such user");
	}
}
