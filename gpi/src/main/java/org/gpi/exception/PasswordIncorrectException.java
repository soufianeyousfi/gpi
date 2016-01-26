package org.gpi.exception;

public class PasswordIncorrectException extends Exception{

	private static final long serialVersionUID = 7952693771984808661L;

	public PasswordIncorrectException() {
		super("The password is inccorect!!!");
	}

}
