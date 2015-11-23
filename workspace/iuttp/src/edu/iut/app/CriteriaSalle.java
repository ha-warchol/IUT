package edu.iut.app;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSalle implements Criteria{
	public List<Classroom> meetCriteria(List<ExamEvent> exams){
		List <Classroom> salle = new ArrayList<Classroom>();
		for(ExamEvent ex : exams){
			salle.add(ex.getClassroom());
		}
		return salle;
	}
}
