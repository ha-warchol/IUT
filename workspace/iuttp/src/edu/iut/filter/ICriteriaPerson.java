package edu.iut.filter;

import java.util.LinkedList;
import edu.iut.app.*;

public interface ICriteriaPerson {
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, Person p);
	
}
