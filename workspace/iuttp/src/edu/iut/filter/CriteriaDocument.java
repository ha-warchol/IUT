package edu.iut.filter;

import java.util.LinkedList;

import edu.iut.app.Document;
import edu.iut.app.ExamEvent;

public class CriteriaDocument implements ICriteriaDocument{

	@Override
	public LinkedList<ExamEvent> meetCriteria(LinkedList<ExamEvent> exam, String URI) {
		LinkedList<ExamEvent> document = new LinkedList<ExamEvent>();
		boolean uri=false;
		for(ExamEvent ex : exam){
			for(Document doc : ex.sesDocuments()){
				if(doc.getDocumentURI().equals(URI)){
					uri=true;
				}
				if(uri){
					document.add(ex);
				}
			}
		}
		return document;
	}
	
}
