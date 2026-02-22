package it.backend.LibraryManage.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cognome;
	@Column(unique = true)
	private String email;
	private String password;
	private char sesso;
	private LocalDate dataCreazione;
	private LocalTime oraCreazione;
	private LocalDate dataModifica;
	private LocalDate oraModifica;
	private Boolean flagElimanto;
	private Boolean isAdmin;
	
	@OneToMany(mappedBy = "utente")
	private List<Noleggio> noleggio;
	
	public Utente() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public char getSesso() {
		return sesso;
	}
	
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	
	public LocalDate getDataCreazione() {
		return dataCreazione;
	}
	
	public void setDataCreazione(LocalDate dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	
	public LocalTime getOraCreazione() {
		return oraCreazione;
	}
	
	public void setOraCreazione(LocalTime oraCreazione) {
		this.oraCreazione = oraCreazione;
	}
	
	public LocalDate getDataModifica() {
		return dataModifica;
	}
	
	public void setDataModifica(LocalDate dataModifica) {
		this.dataModifica = dataModifica;
	}
	
	public LocalDate getOraModifica() {
		return oraModifica;
	}
	
	public void setOraModifica(LocalDate oraModifica) {
		this.oraModifica = oraModifica;
	}
	
	public Boolean getFlagElimanto() {
		return flagElimanto;
	}
	
	public void setFlagElimanto(Boolean flagElimanto) {
		this.flagElimanto = flagElimanto;
	}

	public List<Noleggio> getNoleggio() {
		return noleggio;
	}

	public void setNoleggio(List<Noleggio> noleggio) {
		this.noleggio = noleggio;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
