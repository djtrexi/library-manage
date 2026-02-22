package it.backend.LibraryManage.service;

import java.util.List;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.backend.LibraryManage.model.Utente;
import it.backend.LibraryManage.repository.UtenteRepository;

@Service
public class UtenteService {
	@Autowired
	private UtenteRepository utenteRepository;
	
	public Boolean inserUser(Utente utente) {
		try {
			utenteRepository.save(utente);
			return Boolean.TRUE;
		} catch(Exception e) {
			return null;
		}
	}
	
	public Utente login(String email, String password) {
		Utente utente = utenteRepository.login(email, password);
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
}
