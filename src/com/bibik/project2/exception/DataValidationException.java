package com.bibik.project2.exception;

public class DataValidationException extends Exception {

	public DataValidationException() {
	}

	public DataValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataValidationException(String message) {
		super(message);
	}

	public DataValidationException(Throwable cause) {
		super(cause);
	}

}
