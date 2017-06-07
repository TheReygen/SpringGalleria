package it.uniroma3.persistence;

import it.uniroma3.model.Utente;
import it.uniroma3.service.IUtenteService;

public class MockDB {
	/* classe che carica a DB delle istanze di utente, autore e quadro */

	public static void generateMockDb() {
		
		IUtenteService UtenteServiceImpl = new it.uniroma3.service.UtenteServiceImpl();

		Utente utente1 = new Utente();
		Utente utente2 = new Utente();
		Utente utente = new Utente();

		// utente username: mario password:xyz
		utente.setUsername("mario");
		utente.setPassword("xyz");
		utente.setAdmin(false);
		UtenteServiceImpl.saveUser(utente);

	

		// utente username: chiara password:xyz

		utente1.setUsername("chiara");
		utente1.setPassword("xyz");
		utente1.setAdmin(false);
		UtenteServiceImpl.saveUser(utente1);

		
		

		// utente paolo passw:xyz
		utente2.setUsername("paolo");
		utente2.setPassword("xyz");
		utente2.setAdmin(true);
		UtenteServiceImpl.saveUser(utente2);

	
		
		
		return;
	}

}
