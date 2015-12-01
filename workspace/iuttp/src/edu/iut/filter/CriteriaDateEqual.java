package edu.iut.filter;

import java.util.Date;
import java.util.LinkedList;

import edu.iut.app.ExamEvent;

public class CriteriaDateEqual implements ICriteriaDate {

	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, Date date) {
		LinkedList<ExamEvent> dateEqual = new LinkedList<ExamEvent>();
		for(ExamEvent ex : exam){
			if(ex.getExamDate().compareTo(date) == 0){
				dateEqual.add(ex);
			}
		}
		return dateEqual;
	}
	
}
