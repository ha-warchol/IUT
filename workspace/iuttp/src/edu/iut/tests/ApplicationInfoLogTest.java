package edu.iut.tests;

import static org.junit.Assert.*;
import edu.iut.app.ApplicationErrorLog;
import edu.iut.app.ApplicationInfoLog;
import edu.iut.app.ApplicationWarningLog;

import org.junit.Test;

public class ApplicationInfoLogTest {

	@Test
	public void test() {

		System.out.println("Debut du test InfoLog");
		
		ApplicationErrorLog error = new ApplicationErrorLog();
		ApplicationInfoLog info2 = new ApplicationInfoLog();
		ApplicationInfoLog info = new ApplicationInfoLog();
		ApplicationWarningLog warning = new ApplicationWarningLog();

		System.out.println("Test de la valeur du message de info");
		assertEquals(info.getMessage(),null);
		
		System.out.println("Test de la méthode setMessage()");
		error.setMessage("un message");
		info.setMessage("un message");
		warning.setMessage("un message");
		assertEquals(info.getMessage(),"[INFO]un message");

		System.out.println("Test si les objets info et info2 sont des instances du même objet");
		assertSame(info, info2);
		System.out.println("Test si les objets error et info ne sont pas des instances du même objet");
		assertNotSame(error, info);
		System.out.println("Test si les objets fino et warning ne sont pas des instances du même objet");
		assertNotSame(info,warning);
		System.out.println("Test si les messages de error et info sont les même");
		assertEquals(error.getMessage(), info.getMessage());
		System.out.println("Test si les messages de info et warning sont les même");
		assertEquals(info.getMessage(), warning.getMessage());

		System.out.println("Fin du test infoLog");
	}

}
