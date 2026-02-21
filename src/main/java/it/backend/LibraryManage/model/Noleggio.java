package it.backend.LibraryManage.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Noleggio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dataInizioNoleggio;
	private LocalDate dataFineNoleggio;
	private LocalTime oraInizioNoleggio;
	private LocalTime oraFineNoleggio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codLibro")
	private Libro libro;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codUtente")
	private Utente utente;
	
	public Noleggio() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataInizioNoleggio() {
		return dataInizioNoleggio;
	}

	public void setDataInizioNoleggio(LocalDate dataInizioNoleggio) {
		this.dataInizioNoleggio = dataInizioNoleggio;
	}

	public LocalDate getDataFineNoleggio() {
		return dataFineNoleggio;
	}

	public void setDataFineNoleggio(LocalDate dataFineNoleggio) {
		this.dataFineNoleggio = dataFineNoleggio;
	}

	public LocalTime getOraInizioNoleggio() {
		return oraInizioNoleggio;
	}

	public void setOraInizioNoleggio(LocalTime oraInizioNoleggio) {
		this.oraInizioNoleggio = oraInizioNoleggio;
	}

	public LocalTime getOraFineNoleggio() {
		return oraFineNoleggio;
	}

	public void setOraFineNoleggio(LocalTime oraFineNoleggio) {
		this.oraFineNoleggio = oraFineNoleggio;
	}
}
