package edu.iut.app;

public interface IApplicationLogListener {
	/**
	 * @param message, level
	 * Nouveau message
	 */
	public void newMessage(String level, String message);
}
