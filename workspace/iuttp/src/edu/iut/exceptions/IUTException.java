package edu.iut.exceptions;

// Exercice 2 
public class IUTException extends Exception{
	public IUTException() {
		super();
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe("");

	}
	public IUTException(IUTException e) {
		super (e);
		 edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());;
	}
	public IUTException(String message) {
		super(message);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}
