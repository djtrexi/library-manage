package it.backend.LibraryManage.model;

import it.backend.LibraryManage.model.enums.RuoloLavoratore;

public class Lavoratore extends Utente{
	private RuoloLavoratore ruolo;
	private String isAdmin;
	public RuoloLavoratore getRuolo() {
		return ruolo;
	}
	public void setRuolo(RuoloLavoratore ruolo) {
		this.ruolo = ruolo;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
}
