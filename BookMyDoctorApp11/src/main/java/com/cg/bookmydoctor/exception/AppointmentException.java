package com.cg.bookmydoctor.exception;

public class AppointmentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AppointmentException(String message) {
		super(message);
	}
	public AppointmentException(String message, Throwable throwable) {
		super(message,throwable);
	}
	
}
