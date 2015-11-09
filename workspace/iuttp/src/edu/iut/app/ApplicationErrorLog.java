package edu.iut.app;

public class ApplicationErrorLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	/** Héritage */
	public ApplicationErrorLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		for(int i = 0; i < listeners.size(); i++){
			listeners.get(i).newMessage("[ERROR]", this.message);
		}
	}
	
}
