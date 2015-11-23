package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPerson implements Criteria{
	public List<Person> meetCriteria(List<ExamEvent> exams){
		List <Person> person = new ArrayList<Person>();
		for(ExamEvent ex : exams){
			person.add(ex.getStudent());
		}
		return person;
	}
}
