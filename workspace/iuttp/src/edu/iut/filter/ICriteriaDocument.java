package edu.iut.filter;
import java.util.LinkedList;
import edu.iut.app.*;

public interface ICriteriaDocument {
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, String URI);
}
