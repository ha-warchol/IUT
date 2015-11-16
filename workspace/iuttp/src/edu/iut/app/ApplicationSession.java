package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationSession {
	
	// Exercice 1 : Gérer l'internationation
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	
	
	// Exercice 2 : Logger
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;


	private static ApplicationSession session = null;
	private ApplicationSession() {
		/* Definir US comme locale par défaut */
		locale = new Locale("us", "EN");
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("edu.iut.resources.strings.res");
		sessionGuiLogger = Logger.getLogger("Logger");
		sessionGuiLogger.setLevel(Level.ALL);
		sessionExceptionLogger = Logger.getLogger("Exception");
		sessionExceptionLogger.setLevel(Level.ALL);
	}
	
	/**
	 * 
	 * @return Point d'accès pour l'instance du singleton
	 */
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	/**
	 *
	 * @return Une instance de Logger qui correspond au logger du GUI de la session
	 */
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	/**
	 * 
	 * @return Une instance de Logger qui correspond au logger des Exceptions
	 */
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	
	/**
	 * 
	 * @param locale
	 * Nouvelle langue pour le programme
	 */ 
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=ResourceBundle.getBundle("edt.iut.resources.strings.res");
	}
	
	/**
	 * 
	 * @param key
	 * La clé de la traduction du mot
	 * @return Renvoie la traduction correspondant à la clé
	 */
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	
	
}
