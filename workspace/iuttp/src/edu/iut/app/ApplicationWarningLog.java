package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'héritage ? */
	/** Héritage avec appel du constructeur de la classe mère */
	public ApplicationWarningLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		for(int i = 0; i < listeners.size(); i++){
			listeners.get(i).newMessage("[WARNING]", this.message);
		}
	}
}
