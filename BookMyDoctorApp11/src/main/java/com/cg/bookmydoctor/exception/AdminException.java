package com.cg.bookmydoctor.exception;

public class AdminException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AdminException(String message) {
		super(message);
	}
	public AdminException(String message, Throwable throwable) {
		super(message,throwable);
	}
	

}
