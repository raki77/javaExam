package oop.sec06;

public class InsufficientException extends Exception {
 
	private static final long serialVersionUID = 1L;
	public InsufficientException() {		
	}
	
	public InsufficientException(String msg) {
		super(msg);
	}

}
