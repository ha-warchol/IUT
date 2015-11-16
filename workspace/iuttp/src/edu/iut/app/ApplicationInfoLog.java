package edu.iut.app;

public class ApplicationInfoLog extends AbstractApplicationLog {

	public ApplicationInfoLog() {
		super();
	}
	
	/**
	 * @param message
	 * Initialise tous les logs avec le message passé en paremètre 
	 */
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		ApplicationSession.instance().getGUILogger().info(this.message);
        super.fireMessage("[INFO]", this.message);
	}

}
