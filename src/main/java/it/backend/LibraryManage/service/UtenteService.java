package it.backend.LibraryManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import it.backend.LibraryManage.model.Utente;
import it.backend.LibraryManage.repository.UtenteRepository;

@Service
public class UtenteService {
	@Autowired
	private UtenteRepository utenteRepository;
	
	public Boolean inserUser(Utente utente) {
		try {
			savePassword(utente.getPassword());
			utenteRepository.save(utente);
			return Boolean.TRUE;
		} catch(Exception e) {
			return null;
		}
	}
	
	public Utente login(String email, String password) {
		String pass = savePassword(password);
		Utente utente = utenteRepository.login(email, pass);
		if(utente == null) {
			return null;
		}
		else {
			return utente; 
		}
	}
	
	public List<Utente> listUtente(Boolean flagElimanto) {
		return utenteRepository.listUtente(flagElimanto);
	}
	
	private String savePassword(String password) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String encode = bCryptPasswordEncoder.encode(password);
		return encode;
	}
}
