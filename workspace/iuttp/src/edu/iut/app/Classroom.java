package edu.iut.app;

public class Classroom {
	
	public Classroom() {
		classRoomNumber="not affected";
	}
	public Classroom(String classRoomNumber) {
		/* EX2: AFFECTATION */;
		this.classRoomNumber = classRoomNumber;
	}
	
	/**
	 * Changer le numero de la salle
	 * @param number Numero de salle à mettre
	 */
	public void setClassroomNumber(String number) {
		classRoomNumber=number;
	}
	
	/**
	 * 
	 * @return Renvoie le numero de la salle
	 */
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
}
