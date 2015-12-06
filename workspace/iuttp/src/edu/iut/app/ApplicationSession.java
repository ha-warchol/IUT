package edu.iut.app;

import java.util.ResourceBundle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

public class ApplicationSession {
	
	protected ResourceBundle resourceBundle;
	protected Locale locale;
	protected Logger sessionGuiLogger;
	protected Logger sessionExceptionLogger;
	protected String[] months;
	protected String[] days;
	protected JFrame myFrame;


	private static ApplicationSession session = null;
	private ApplicationSession() {
		locale = Locale.getDefault();
		resourceBundle = ResourceBundle.getBundle("edu.iut.resources.strings.res");
		sessionGuiLogger = Logger.getLogger("IUTTrain");
		sessionGuiLogger.setLevel(Level.ALL);
		sessionExceptionLogger = Logger.getLogger("IUTException");
		sessionExceptionLogger.setLevel(Level.ALL);
		
		days = new String[7];
		days[0] = getString("monday"); days[1] =  getString("tuesday"); days[2] =  getString("wednesday");
		days[3] = getString("thursday");   days[4] =  getString("friday"); days[5] =  getString("saturday");
		days[6] = getString("sunday"); 
		
		months = new String[12];
		months[0] = getString("january"); months[1] =  getString("february"); months[2] =  getString("march");
		months[3] = getString("april");   months[4] =  getString("may");      months[5] =  getString("june");
		months[6] = getString("july"); months[7] =  getString("august"); months[8] =  getString("september");
		months[9] = getString("october"); months[10] =  getString("november"); months[11] =  getString("december");
		
		
	}
	
	/**
	 * Création du Singleton
	 * @return ApplicationSession
	 */
	static public ApplicationSession instance() {
		if (session == null) {			
			session = new ApplicationSession();
		}
		return session;
	}
	
	/**
	 * Obtenir le logger du GUI
	 * @return Logge
	 */
	public Logger getGUILogger() {
		return sessionGuiLogger;
	}
	
	/**
	 * Obtenir le logger des exceptions
	 * @return Logger
	 */
	public Logger getExceptionLogger() {
		return sessionExceptionLogger;
	}
	/**
	 * Changer le Locale
	 * @param locale Nouveau Locale
	 */
	public void setLocale(Locale locale){
		this.locale = locale;
		Locale.setDefault(this.locale);
		resourceBundle=ResourceBundle.getBundle("edu.iut.resources.strings.res");
	}
	
	/**
	 * Obtenir la traduction selon une clé donnée
	 * @param key Clé du mot à traduire
	 * @return Traduction
	 */
	public String getString(String key) {
		return resourceBundle.getString(key);
	}
	/**
	 * Obtenir la liste des jours
	 * @return Liste de jours
	 */
	public String[] getDays() {
		return days;
	}
	
	/**
	 * Obtenir la liste des mois
	 * @return Liste de mois
	 */
	public String[] getMonths() {
		return months;
	}
	
	
}
