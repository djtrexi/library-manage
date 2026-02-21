package it.backend.LibraryManage.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String autore;
	private String casaEditrice;
	private int anno;
	private int quantità;
	
	@OneToMany(mappedBy = "libro")
	private List<LibroScaffale> libroScaffale;
	
	@OneToMany(mappedBy = "libro")
	private List<Noleggio> noleggio;
	
	public Libro() {}

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

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getCasaEditrice() {
		return casaEditrice;
	}

	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public List<LibroScaffale> getLibroScaffale() {
		return libroScaffale;
	}

	public void setLibroScaffale(List<LibroScaffale> libroScaffale) {
		this.libroScaffale = libroScaffale;
	}

	public List<Noleggio> getNoleggio() {
		return noleggio;
	}

	public void setNoleggio(List<Noleggio> noleggio) {
		this.noleggio = noleggio;
	}
}
