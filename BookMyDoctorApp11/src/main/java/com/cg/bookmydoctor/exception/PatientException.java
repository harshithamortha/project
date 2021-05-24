package com.cg.bookmydoctor.exception;

public class PatientException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public PatientException(String message) {
		super(message);
		
	}
	public PatientException(String message, Throwable throwable) {
		super(message,throwable);
	}
}
