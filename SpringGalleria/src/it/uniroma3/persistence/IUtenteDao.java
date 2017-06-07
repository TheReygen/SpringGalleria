package it.uniroma3.persistence;

import it.uniroma3.model.Utente;

public interface IUtenteDao {

	void addUser(Utente user);

	void deleteUser(String userName);

	Utente findByID(String username);

	Utente findByUsernameAndPassword(String username, String password);
}
