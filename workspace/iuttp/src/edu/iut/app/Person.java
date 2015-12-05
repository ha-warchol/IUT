package edu.iut.app;

public class Person {

	public enum PersonFunction{
		/* EX2 : Internationalisation */
		NONE(ApplicationSession.instance().getString("none")),
		JURY(ApplicationSession.instance().getString("jury")),
		STUDENT(ApplicationSession.instance().getString("student"));

		private String personFunction;

		PersonFunction(String personFunction) {
			this.personFunction = personFunction;
		}

		public String toString() {
			return personFunction;
		}		
	}

	public Person() {
		personFunction = PersonFunction.NONE;
	}

	public Person(PersonFunction personFunction,
			String firstname,
			String lastname,
			String email,
			String phone) {
		/* EX2: initialisation */
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.personFunction = personFunction;
	}
	
	/**
	 * Changer la fonction de la personne (jury, etudiant ou rien)
	 * @param function Fonction
	 */
	public void setFunction(PersonFunction function) {
		this.personFunction = function;
	}
	
	/**
	 * Obtenir la fonction d'une personne
	 * @return Fontion 
	 */
	public PersonFunction getFunction() {
		return personFunction;
	}
	
	/** 
	 * Changer le prénom d'une personne
	 * @param firstname Prenom
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	/**
	 * Obtenir le prénom d'une personne
	 * @return Prénom
	 */
	public String getFirstname() {
		return firstname;
	}
	
	/**
	 * Changer le nom de famille d'une personne
	 * @param lastname Nom de famille
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	/**
	 * Obtenir le nom de famille d'une personne
	 * @return Nom de famille
	 */
	public String getLastname() {
		return lastname;
	}
	
	/**
	 * Changer l'adresse mail d'une personne
	 * @param email Adresse mail de la personne
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Obtenir adresse mail d'une personne
	 * @return Adresse mail
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Changer numero de téléphone d'une personne
	 * @param phone Numero de téléphone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * Obtenir le numero de téléphone d'une personne
	 * @return Numero de telephone
	 */
	public String getPhone() {
		return phone;
	}


	protected PersonFunction personFunction;
	protected String firstname;
	protected String lastname;
	protected String email;
	protected String phone;


}
