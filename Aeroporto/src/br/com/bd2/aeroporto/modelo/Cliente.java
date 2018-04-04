package br.com.bd2.aeroporto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 15, nullable = false, unique = true)
	private String cpf;
	@Column(length = 15, nullable = false, unique = true)
	private String rg;
	@Column(length = 50, nullable = false)
	private String nome;
	@Column(length = 100, nullable = false)
	private String endereco;
	@Column(length = 15, nullable = false)
	private String telefone;
	@Column(length = 15, nullable = false)
	private String telFamiliar;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelFamiliar() {
		return telFamiliar;
	}

	public void setTelFamiliar(String telFamiliar) {
		this.telFamiliar = telFamiliar;
	}
}
