package com.cg.bookmydoctor.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AdminException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AdminException(String message) {
		super(message);
	}
	public AdminException(String message, Throwable throwable) {
		super(message,throwable);
	}
	

}
