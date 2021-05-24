package com.cg.bookmydoctor.exception;

public class AvailabilityException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public AvailabilityException(String message) {
		super(message);
		
	}
	public AvailabilityException(String message, Throwable throwable) {
		super(message,throwable);
	}
}
