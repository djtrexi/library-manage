package it.backend.LibraryManage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LibroScaffale {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codLibro")
	private Libro libro;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codScaffale")
	private Scaffale scaffale;
	
	public LibroScaffale() {}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Scaffale getScaffale() {
		return scaffale;
	}

	public void setScaffale(Scaffale scaffale) {
		this.scaffale = scaffale;
	}
}
