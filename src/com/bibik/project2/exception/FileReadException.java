package com.bibik.project2.exception;

public class FileReadException extends Exception {
	public FileReadException() {
		
	}

	public FileReadException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileReadException(String message) {
		super(message);
	}

	public FileReadException(Throwable cause) {
		super(cause);
	}
}
