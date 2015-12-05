package edu.iut.app;

public class Document {
	
	public Document() {
		documentURI="";
	}
	public Document(String documentURI) {
		/* EX2 : Affectation */
		this.documentURI=documentURI;
	}
	
	/**
	 * Changer l'URI d'un document
	 * @param number URI
	 */
	public void setDocumentURI(String number) {
		this.documentURI = number;
	}
	
	/**
	 * Obtenir l'URI d'un document
	 * @return URI
	 */
	public String getDocumentURI() {
		return documentURI;
	}
	
	protected String documentURI;
}
