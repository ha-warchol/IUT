package edu.iut.filter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.iut.app.ExamEvent;

public class CriteriaDate {
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams, Date date){
		List <ExamEvent> dateList = new ArrayList<ExamEvent>();
		for(ExamEvent ex : exams){
			if(ex.getExamDate() == date)
			dateList.add(ex);
		}
		return dateList;
	}
}
