package edu.iut.app;
import java.util.List;

public class AndCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria (Criteria criteria, Criteria othercriteria){
		this.criteria = criteria;
		this.otherCriteria = othercriteria;
	}
	public List meetCriteria(List<ExamEvent> exam){
		List<?> firstCriteria = criteria.meetCriteria(exam);
		return otherCriteria.meetCriteria(firstCriteria);
		
	}
}
