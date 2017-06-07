package it.uniroma3.service;

import it.uniroma3.model.Utente;

public interface IUtenteService {
	
	boolean saveUser(Utente u);

	boolean deleteUser(Utente u);

	Utente findByUsername(String username);

	boolean isLogged(Utente u);
	
	boolean isAdmin(Utente u);


}
