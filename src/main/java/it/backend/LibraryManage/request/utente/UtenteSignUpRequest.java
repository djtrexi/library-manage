package it.backend.LibraryManage.request.utente;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UtenteSignUpRequest {
	private String nome;
	private String cognome;
	private String indirizzo;
	private String email;
	
	public UtenteSignUpRequest() {}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@JsonIgnore
	public Boolean isValid() {
		String regex_mail = "^[A-Za-z0-9+_.-]+@(.+)$";
		
		if(!email.matches(regex_mail) || nome.isEmpty() || cognome.isEmpty()) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
