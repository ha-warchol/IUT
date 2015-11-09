package edu.iut.app;

public interface IApplicationLog {
	/** TP1 : Créér les méthodes :
	 - setMessage
	  - getMessage
	  - addListener
	  - getApplicationLogListeners();
	*/
	public void setMessage(String message);
	public String getMessage();
	public void addListener(IApplicationLogListener listener);
	public IApplicationLogListener[] getApplicationLogListeners();
}
