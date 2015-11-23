package edu.iut.exceptions;

public class IUTException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public IUTException() {
		super();
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe("empty");
	}
	public IUTException(IUTException e) {
		super (e);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(e.getMessage());
	}
	public IUTException(String message) {
		super(message);
		edu.iut.app.ApplicationSession.instance().getExceptionLogger().severe(message);
	}
	
}
