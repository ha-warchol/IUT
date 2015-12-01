package edu.iut.filter;

import java.util.LinkedList;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

public class CriteriaPersonPhone implements ICriteriaPerson{

	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, Person p) {
		LinkedList <ExamEvent> personPhone = new LinkedList<ExamEvent>();
		for(ExamEvent ex : exam){
			if(ex.getStudent().getPhone().equals(p.getPhone())){
				personPhone.add(ex);
			}
		}
		return personPhone;
	}
}
