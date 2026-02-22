package it.backend.LibraryManage.response.utente.DTO;

import it.backend.LibraryManage.model.Utente;

public class UtenteDTO {
	private String nome;
	private String cognome;
	private String indirizzo;
	private String email;
	
	public UtenteDTO() {}
	
	public UtenteDTO(Utente u) {
		this.nome = u.getNome();
		this.cognome = u.getCognome();
		this.indirizzo = u.getIndirizzo();
		this.email = u.getEmail();
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
