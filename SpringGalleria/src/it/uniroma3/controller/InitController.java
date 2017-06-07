package it.uniroma3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import it.uniroma3.persistence.MockDB;

@Controller
public class InitController {
	@RequestMapping(value = "/")
	public String getBook() {
		// carico Dati a Db:
		// User   mario passw:xyz
		// Admin  paolo passw:xyz
		System.out.println("Caricamento Mock DB");
		MockDB.generateMockDb();
		return "loginpage";
	}

}
