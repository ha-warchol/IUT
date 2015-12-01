package edu.iut.filter;

import java.util.LinkedList;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

public class CriteriaPersonMail implements ICriteriaPerson {

	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, Person p) {
		LinkedList<ExamEvent> personMail = new LinkedList<ExamEvent>();
		for(ExamEvent ex : exam){
			if(ex.getStudent().getEmail().equals(p.getEmail())){
				personMail.add(ex);
			}
		}
		return personMail;
	}
	
}
