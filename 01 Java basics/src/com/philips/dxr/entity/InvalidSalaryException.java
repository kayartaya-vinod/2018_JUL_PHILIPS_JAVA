package com.philips.dxr.entity;

public class InvalidSalaryException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidSalaryException() {
		super();
	}

	public InvalidSalaryException(String message) {
		super(message);
	}

	public InvalidSalaryException(Throwable cause) {
		super(cause);
	}

}
