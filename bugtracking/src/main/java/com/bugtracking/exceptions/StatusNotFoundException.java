package com.bugtracking.exceptions;

public class StatusNotFoundException extends RuntimeException {
	public StatusNotFoundException(String msg) {
		super(msg);
	}

}
