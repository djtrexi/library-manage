package it.backend.LibraryManage.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Scaffale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ubicazione;
	private Double lunghezza;
	private Double altezza;
	
	@OneToMany(mappedBy = "scaffale")
	private List<LibroScaffale> libroScaffale;
	
	public Scaffale() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUbicazione() {
		return ubicazione;
	}

	public void setUbicazione(String ubicazione) {
		this.ubicazione = ubicazione;
	}

	public Double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(Double lunghezza) {
		this.lunghezza = lunghezza;
	}

	public Double getAltezza() {
		return altezza;
	}

	public void setAltezza(Double altezza) {
		this.altezza = altezza;
	}

	public List<LibroScaffale> getLibroScaffale() {
		return libroScaffale;
	}

	public void setLibroScaffale(List<LibroScaffale> libroScaffale) {
		this.libroScaffale = libroScaffale;
	}
}
