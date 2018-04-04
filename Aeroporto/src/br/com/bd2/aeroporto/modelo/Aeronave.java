package br.com.bd2.aeroporto.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Aeronave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 6, nullable = false, unique = true)
	private String prefixo;
	@Column(length = 50, nullable = false)
	private String modelo;

	@Column(nullable = false)
	private Integer capacidade;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Calendar datafabricacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Calendar getDatafabricacao() {
		return datafabricacao;
	}

	public void setDatafabricacao(Calendar datafabricacao) {
		this.datafabricacao = datafabricacao;
	}

}
