package edu.iut.filter;
import edu.iut.app.*;
import java.util.Date;
import java.util.LinkedList;

public interface ICriteriaDate {
	public LinkedList <ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, Date date);
}
