package com.zemoso.access_control.input;

public class InvalidInputException extends Exception {
	
	private static final long serialVersionUID = 1L;

	InvalidInputException(String message){
		super(message);
	}
}
