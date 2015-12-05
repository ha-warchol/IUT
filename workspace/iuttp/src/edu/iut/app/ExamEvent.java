package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;

public class ExamEvent {
	public ExamEvent() {		
	}

	public ExamEvent(Date date, Person person, ArrayList<Person> jury,
			Classroom classRoom, ArrayList<Document> document) {

	}

	/** EX2: FAITE LES ACCESSEURS DES ATTRIBUTS, AJOUTER DES ATTRIBUT ? **/
	protected Date examDate;
	protected Person student;
	protected ArrayList<Person> jury;
	protected Classroom classroom;
	protected ArrayList<Document> documents;
	
	/**
	 * Obtenir la date d'examen
	 * @return Date
	 */
	public Date getExamDate(){
		return examDate;
	}
	
	/**
	 * Obtenir la personne qui passe l'examen
	 * @return Personne
	 */
	public Person getStudent(){
		return student;
	}
	
	/**
	 * Obtenir la liste des jury pour un examen
	 * @return Liste de jury
	 */
	public ArrayList<Person> sonJury(){
		return jury;
	}
	
	/**
	 * Obtenir la salle où se déroule l'examen
	 * @return Salle
	 */
	public Classroom getClassroom(){
		return classroom;
	}
	
	/**
	 * Obtenir la liste des documents
	 * @return Liste de documents
	 */
	public ArrayList<Document> sesDocuments(){
		return documents;
	}
}
