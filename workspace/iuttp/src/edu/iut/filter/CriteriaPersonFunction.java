package edu.iut.filter;

import java.util.LinkedList;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

public class CriteriaPersonFunction implements ICriteriaPerson {

	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, Person p) {
		LinkedList<ExamEvent> personFunction = new LinkedList<ExamEvent>();
		for(ExamEvent ex : exam){
			if(ex.getStudent().getFunction().equals(p.getFunction())){
				personFunction.add(ex);
			}
		}
		return personFunction;
	}
	

}
