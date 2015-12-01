package edu.iut.filter;

import java.util.LinkedList;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

public class CriteriaPersonFirstName implements ICriteriaPerson {

	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, Person p) {
		LinkedList<ExamEvent> personName = new LinkedList<ExamEvent>();
		for(ExamEvent ex : exam){
			if(ex.getStudent().getFirstname().equals(p.getFirstname())){
				personName.add(ex);
			}
		}
		return personName;
	}

}
