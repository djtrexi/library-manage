package it.backend.LibraryManage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.backend.LibraryManage.model.Utente;
import it.backend.LibraryManage.repository.UtenteRepository;

@Service
public class UtenteService {
	@Autowired
	private UtenteRepository utenteRepository;

	public Boolean inserUser(Utente utente) {
		if (utenteRepository.getUserByEmail(utente.getEmail()) == null) {
			utenteRepository.save(utente);
			return Boolean.TRUE;
		}
		else {
			return null ;
		}
	}

	public Utente login(Long id) {
		Utente utente = utenteRepository.getReferenceById(id);
		if(utente == null) {
			return null;
		}
		else {
			return utente; 
		}
	}

	public Boolean modifyUtente(Long id, Utente utente) {
		Utente utenteDb = utenteRepository.getReferenceById(id);
		if (utenteDb == null) {
			return null;
		}
		else {
			utenteDb.setCognome(utente.getCognome());
			utenteDb.setNome(utente.getNome());
			if (utente.getEmail() != null && !utente.getEmail().equals("")) {
				if (!utente.getEmail().equals(utenteDb.getEmail())) {
					utenteDb.setEmail(utente.getEmail());
				}
			}
			if (utente.getEmail() != null && !utente.getIndirizzo().equals("")) {
				utenteDb.setIndirizzo(utente.getIndirizzo());
			}
			utenteRepository.save(utenteDb);
			return Boolean.TRUE;
		}
	}

	public Boolean deleteUtente(Long id) {
		Utente utente = utenteRepository.getReferenceById(id);
		if (utente == null) {
			return Boolean.FALSE;
		}
		utenteRepository.delete(utente);
		return Boolean.TRUE;
	}

	public List<Utente> getFilterListUser(String nome, String cognome) {
		if (nome.equals("")) {
			return utenteRepository.getListUserBySurname(cognome);
		}
		else {
			if (cognome.equals("")) {
				return utenteRepository.getListUserByName(nome);
			}
			else {
				List<Utente> listUtenteCognome = utenteRepository.getListUserBySurname(cognome);
				List<Utente> listUtenteNome = utenteRepository.getListUserByName(nome);
				List<Utente> listUtentes = new ArrayList<Utente>();
				if (listUtenteCognome.isEmpty() || listUtenteNome.isEmpty()) {
					return listUtentes;
				}
				else {
					for (int i = 0; i < listUtenteNome.size(); i++) {
						if (listUtenteNome.get(i).getId() == listUtenteCognome.get(i).getId()) {
							listUtentes.add(listUtenteNome.get(i));
						}
					}
					return listUtentes;
				}
			}
		}
	}
}
