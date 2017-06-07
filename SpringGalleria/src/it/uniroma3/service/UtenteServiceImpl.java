package it.uniroma3.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;

import it.uniroma3.model.Utente;

@Service
public class UtenteServiceImpl implements IUtenteService {
	private static EntityManager em;
	private static EntityManagerFactory emf;

	@Override
	public boolean saveUser(Utente u) {
		// TODO Auto-generated method stub
		UtenteServiceImpl.emf = Persistence.createEntityManagerFactory("galleria");
		UtenteServiceImpl.em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(u);
		em.flush();
		tx.commit();
		UtenteServiceImpl.em.clear();
		UtenteServiceImpl.emf.close();
		return false;
	}

	@Override
	public boolean deleteUser(Utente u) {
		// TODO Auto-generated method stub
		UtenteServiceImpl.emf = Persistence.createEntityManagerFactory("galleria");
		UtenteServiceImpl.em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(em.contains(u) ? u : em.merge(u));
		et.commit();
		em.close();
		emf.close();
		return false;
	}

	@Override
	public Utente findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLogged(Utente u) {
		// TODO Auto-generated method stub
		UtenteServiceImpl.emf = Persistence.createEntityManagerFactory("galleria");
		UtenteServiceImpl.em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		boolean isLogged = false;
		if (em.contains(u))
			isLogged = true;
		;
		em.close();
		emf.close();
		return isLogged;
	}

	@Override
	public boolean isAdmin(Utente u) {
		// TODO Auto-generated method stubthis.em = emf.createEntityManager();
		UtenteServiceImpl.emf = Persistence.createEntityManagerFactory("galleria");
		EntityTransaction et = em.getTransaction();
		et.begin();
		boolean isAdmin = false;
		if (em.contains(u))
			isAdmin = true;
		;
		em.close();
		emf.close();
		return isAdmin;
	}

}
