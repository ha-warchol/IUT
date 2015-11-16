package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	/**
	 * 
	 * @return ArrayList de logs si ce sont des erreurs
	 */
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog a : this) {
			if (a instanceof ApplicationErrorLog) {
				filteredLogs.add(a);
			}
		}
		return filteredLogs;
	}
	/**
	 * 
	 * @return ArrayList de logs si ce sont des warnings
	 */
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog a : this) {
			if (a instanceof ApplicationWarningLog) {
				filteredLogs.add(a);
			}
		}
		return filteredLogs;
	}
	/**
	 * 
	 * @return ArrayList de logs si ce sont des informations
	 */
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog a : this) {
			if (a instanceof ApplicationInfoLog) {
				filteredLogs.add(a);
			}
		}
		return filteredLogs;
	}
	

}
