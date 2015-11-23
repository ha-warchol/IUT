package edu.iut.app;

import java.util.List;

public class OrCriteria implements Criteria {
	 private Criteria criteria;
	   private Criteria otherCriteria;

	   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
	      this.criteria = criteria;
	      this.otherCriteria = otherCriteria; 
	   }

	   @Override
	   public List meetCriteria(List<ExamEvent> exams) {
	      List<?> firstCriteria = criteria.meetCriteria(exams);
	      List<?> otherCriteria = otherCriteria.meetCriteria(firstCriteria);

	      for (ExamEvent ex : otherCriteria) {
	         if(!firstCriteria.contains(ex)){
	            firstCriteria.add(ex);
	         }
	      }	
	      return firstCriteria;
	   }
}
