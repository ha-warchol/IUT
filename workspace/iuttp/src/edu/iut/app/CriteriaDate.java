package edu.iut.app;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CriteriaDate implements Criteria{
	public List<Date> meetCriteria(List<ExamEvent> exams){
		List <Date> date = new ArrayList<Date>();
		for(ExamEvent ex : exams){
			date.add(ex.getExamDate());
		}
		return date;
	}
}
