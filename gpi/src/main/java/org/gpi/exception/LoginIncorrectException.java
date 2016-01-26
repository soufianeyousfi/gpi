package org.gpi.exception;

public class LoginIncorrectException extends Exception{

	private static final long serialVersionUID = 7952693771984808661L;

	public LoginIncorrectException() {
		super("This login does not exist!!");
	}

}
