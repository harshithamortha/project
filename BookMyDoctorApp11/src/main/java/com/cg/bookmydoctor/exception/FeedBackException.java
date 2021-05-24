package com.cg.bookmydoctor.exception;

public class FeedBackException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public FeedBackException(String message) {
		super(message);
		
	}
	public FeedBackException(String message, Throwable throwable) {
		super(message,throwable);
	}
}
