package edu.iut.app;

public class ApplicationErrorLog extends AbstractApplicationLog {

	public ApplicationErrorLog() {
		super();
	}
	
	/**
	 * @param message
	 * Initialise tous les logs avec le message passé en paremètre 
	 */
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().severe(this.message);
		super.fireMessage("[ERROR]", this.message);
	}


}
