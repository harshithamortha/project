package com.cg.bookmydoctor.exception;

public class DoctorException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DoctorException(String message) {
		super(message);
		
	}
	public DoctorException(String message, Throwable throwable) {
		super(message,throwable);
	}
}
