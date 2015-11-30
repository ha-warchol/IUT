package edu.iut.filter;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.ExamEvent;
import edu.iut.app.Person;

public class CriteriaPerson {
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams, Person person){
		List <ExamEvent> personList = new ArrayList<ExamEvent>();
		for(ExamEvent ex : exams){
			if(ex.getStudent() == person)
				personList.add(ex);
		}
		return personList;
	}
}
