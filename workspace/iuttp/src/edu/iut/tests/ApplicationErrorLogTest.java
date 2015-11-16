package edu.iut.tests;

import static org.junit.Assert.*;
import edu.iut.app.ApplicationErrorLog;
import edu.iut.app.ApplicationInfoLog;
import edu.iut.app.ApplicationWarningLog;

import org.junit.Test;

public class ApplicationErrorLogTest {

	@Test
	public void test() {

		System.out.println("Debut du test ErrorLog");
		
		ApplicationErrorLog error = new ApplicationErrorLog();
		ApplicationErrorLog error2 = new ApplicationErrorLog();
		ApplicationInfoLog info = new ApplicationInfoLog();
		ApplicationWarningLog warning = new ApplicationWarningLog();

		System.out.println("Test de la valeur du message de error");
		assertEquals(error.getMessage(),null);
		
		System.out.println("Test de la méthode setMessage()");
		error.setMessage("un message");
		info.setMessage("un message");
		warning.setMessage("un message");
		assertEquals(error.getMessage(),"[ERROR]un message");

		System.out.println("Test si les objets error et error2 sont des instances du même objet");
		assertSame(error, error2);
		System.out.println("Test si les objets error et info ne sont pas des instances du même objet");
		assertNotSame(error, info);
		System.out.println("Test si les objets error et warning ne sont pas des instances du même objet");
		assertNotSame(error,warning);
		System.out.println("Test si les messages de error et info sont les même");
		assertEquals(error.getMessage(), info.getMessage());
		System.out.println("Test si les messages de error et warning sont les même");
		assertEquals(error.getMessage(), warning.getMessage());

		System.out.println("Fin du test errorLog");
	}

}
