package it.backend.LibraryManage.response.utente;

import it.backend.LibraryManage.model.Utente;

public class UtenteLoginUserResponse {
	private String nome;
	private String cognome;
	private String email;
	private String indirizzo;
	
	public UtenteLoginUserResponse() {}
	
	public UtenteLoginUserResponse(Utente u) {
		this.nome = u.getNome();
		this.cognome = u.getCognome();
		this.email = u.getEmail();
		this.indirizzo = u.getIndirizzo();
	}

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
}
