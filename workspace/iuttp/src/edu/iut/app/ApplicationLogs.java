package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog log_i : this ) {
			if(log_i instanceof ApplicationErrorLog)
				filteredLogs.add(log_i);
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog log_i : this) {
			if(log_i instanceof ApplicationWarningLog)
				filteredLogs.add(log_i);
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		for (IApplicationLog log_i : this) {
			if(log_i instanceof ApplicationInfoLog)
				filteredLogs.add(log_i);
		}
		return filteredLogs;
	}
	

}
