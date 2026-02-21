package it.backend.LibraryManage.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Cliente extends Utente {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codAbbonamento")
	private Abbonamento abbonamento;

	public Abbonamento getAbbonamento() {
		return abbonamento;
	}

	public void setAbbonamento(Abbonamento abbonamento) {
		this.abbonamento = abbonamento;
	}
}
