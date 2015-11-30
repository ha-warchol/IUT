package edu.iut.filter;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.Classroom;
import edu.iut.app.ExamEvent;

public class CriteriaSalle {
	public List<ExamEvent> meetCriteria(List<ExamEvent> exams, Classroom salle){
		List <ExamEvent> salleList = new ArrayList<ExamEvent>();
		for(ExamEvent ex : exams){
			if(ex.getClassroom() == salle)
				salleList.add(ex);
		}
		return salleList;
	}
}
