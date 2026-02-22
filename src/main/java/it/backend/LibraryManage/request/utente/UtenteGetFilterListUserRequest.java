package it.backend.LibraryManage.request.utente;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UtenteGetFilterListUserRequest {
	private String nome;
	private String cognome;
	
	public UtenteGetFilterListUserRequest() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@JsonIgnore
	public Boolean isValid() {
		if (nome.isEmpty() || cognome.isEmpty()) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
