package edu.iut.app;

public interface IApplicationLog {
	/** TP1 : Créér les méthodes :
	 - setMessage
	  - getMessage
	  - addListener
	  - getApplicationLogListeners();
	*/
	void setMessage(String message);
	String getMessage();
	void addListener(IApplicationLogListener listener);
	IApplicationLogListener[] getApplicationLogListeners();
}
