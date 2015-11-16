package edu.iut.app;

public interface IApplicationLogListener {
	/**
	 * @param message
	 * Nouveau message
	 * @param level
	 * Niveau du message
	 */
	public void newMessage(String level, String message);
}
