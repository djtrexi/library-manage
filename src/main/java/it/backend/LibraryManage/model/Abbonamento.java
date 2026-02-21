package it.backend.LibraryManage.model;

import java.util.List;

import it.backend.LibraryManage.model.enums.TipoAbbonamento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Abbonamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double costo;
	private TipoAbbonamento tipo;
	
	@OneToMany(mappedBy = "abbonamento")
	private List<Cliente> cliente;
	
	public Abbonamento() {}

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

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public TipoAbbonamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoAbbonamento tipo) {
		this.tipo = tipo;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
}
