package edu.iut.filter;

import java.util.Date;
import java.util.LinkedList;

import edu.iut.app.ExamEvent;

public class CriteriaDateBefore implements ICriteriaDate {

	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, Date date) {
		LinkedList<ExamEvent> dateBefore = new LinkedList<ExamEvent>();
		for(ExamEvent ex : exam){
			if(ex.getExamDate().compareTo(date) < 0){
				dateBefore.add(ex);
			}
		}
		return dateBefore;
	}
	
}
