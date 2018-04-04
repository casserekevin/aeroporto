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
public class Piloto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 50, nullable = false)
	private String nome;
	@Column(length = 50, nullable = false)
	private String email;
	@Column(length = 15, nullable = false)
	private String telefone;
	@Column(length = 100, nullable = false)
	private String endereco;
	@Column(length = 8, nullable = false)
	private String numPassaporte;

	@Column(nullable = false)
	private Integer numBreve;
	@Column(nullable = false)
	private Integer horasVoo;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Calendar dataContratacao;

	public Piloto() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumPassaporte() {
		return numPassaporte;
	}

	public void setNumPassaporte(String numPassaporte) {
		this.numPassaporte = numPassaporte;
	}

	public Integer getNumBreve() {
		return numBreve;
	}

	public void setNumBreve(Integer numBreve) {
		this.numBreve = numBreve;
	}

	public Integer getHorasVoo() {
		return horasVoo;
	}

	public void setHorasVoo(Integer horasVoo) {
		this.horasVoo = horasVoo;
	}

	public Calendar getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

}
