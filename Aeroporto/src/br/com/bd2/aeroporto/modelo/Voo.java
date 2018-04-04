package br.com.bd2.aeroporto.modelo;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Voo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 100, nullable = false)
	private String origem;
	@Column(length = 100, nullable = false)
	private String destino;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Calendar dataHoraSaida;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Calendar dataHoraChegada;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Piloto piloto;

	@ManyToMany
	@JoinColumn(nullable = false)
	private List<Aeronave> aeronaves;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDataHoraSaida() {
		return dataHoraSaida;
	}

	public void setDataHoraSaida(Calendar dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}

	public Calendar getDataHoraChegada() {
		return dataHoraChegada;
	}

	public void setDataHoraChegada(Calendar dataHoraChegada) {
		this.dataHoraChegada = dataHoraChegada;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public List<Aeronave> getAeronaves() {
		return aeronaves;
	}

	public void setAeronaves(List<Aeronave> aeronaves) {
		this.aeronaves = aeronaves;
	}

}
