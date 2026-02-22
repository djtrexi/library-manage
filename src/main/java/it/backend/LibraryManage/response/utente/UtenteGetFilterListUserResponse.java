package it.backend.LibraryManage.response.utente;

import java.util.ArrayList;
import java.util.List;

import it.backend.LibraryManage.model.Utente;
import it.backend.LibraryManage.response.utente.DTO.UtenteDTO;

public class UtenteGetFilterListUserResponse {
	private List<UtenteDTO> utenteDTO;
	
	public UtenteGetFilterListUserResponse() {}
	
	public UtenteGetFilterListUserResponse(List<Utente> utente) {
		utenteDTO = new ArrayList<>();
		
		for(int i = 0; i < utente.size(); i++) {
			utenteDTO.add(new UtenteDTO(utente.get(i)));
		}
	}

	public List<UtenteDTO> getUtenteDTO() {
		return utenteDTO;
	}

	public void setUtenteDTO(List<UtenteDTO> utenteDTO) {
		this.utenteDTO = utenteDTO;
	}
}
