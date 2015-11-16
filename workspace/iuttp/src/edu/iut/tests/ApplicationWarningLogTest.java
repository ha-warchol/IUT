package edu.iut.tests;

import static org.junit.Assert.*;
import edu.iut.app.ApplicationErrorLog;
import edu.iut.app.ApplicationInfoLog;
import edu.iut.app.ApplicationWarningLog;

import org.junit.Test;

public class ApplicationWarningLogTest {

	@Test
	public void test() {

		System.out.println("Debut du test warningLog");
		
		ApplicationErrorLog error = new ApplicationErrorLog();
		ApplicationWarningLog warning2 = new ApplicationWarningLog();
		ApplicationInfoLog info = new ApplicationInfoLog();
		ApplicationWarningLog warning = new ApplicationWarningLog();

		System.out.println("Test de la valeur du message de warning");
		assertEquals(warning.getMessage(),null);
		
		System.out.println("Test de la méthode setMessage()");
		error.setMessage("un message");
		info.setMessage("un message");
		warning.setMessage("un message");
		assertEquals(warning.getMessage(),"[WARNING]un message");

		System.out.println("Test si les objets warning et warning2 sont des instances du même objet");
		assertSame(warning, warning2);
		System.out.println("Test si les objets warning et info ne sont pas des instances du même objet");
		assertNotSame(warning, info);
		System.out.println("Test si les objets error et warning ne sont pas des instances du même objet");
		assertNotSame(error,warning);
		System.out.println("Test si les messages de warning et info sont les même");
		assertEquals(warning.getMessage(), info.getMessage());
		System.out.println("Test si les messages de error et warning sont les même");
		assertEquals(error.getMessage(), warning.getMessage());

		System.out.println("Fin du test warningLog");
	}

}
