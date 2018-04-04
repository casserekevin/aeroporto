package br.com.bd2.aeroporto.teste;

import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.bd2.aeroporto.modelo.Aeronave;
import br.com.bd2.aeroporto.modelo.Piloto;
import br.com.bd2.aeroporto.modelo.Voo;
import br.com.bd2.aeroporto.util.JPAUtil;

public class TestaVoo {

	public static void main(String[] args) {
		Piloto piloto = new Piloto();
		piloto.setNome("João Pedro");
		piloto.setEmail("joaoP@hotmail.com");
		piloto.setTelefone("(51) 999999999");
		piloto.setEndereco("Presidente Kennedy");
		piloto.setNumPassaporte("AB123456");
		piloto.setNumBreve(1234);
		piloto.setHorasVoo(200);
		piloto.setDataContratacao(Calendar.getInstance());

		Aeronave a1 = new Aeronave();
		a1.setPrefixo("ABC123");
		a1.setModelo("Boing");
		a1.setCapacidade(140);
		a1.setDatafabricacao(Calendar.getInstance());

		Aeronave a2 = new Aeronave();
		a2.setPrefixo("DEF456");
		a2.setModelo("Boing");
		a2.setCapacidade(160);
		a2.setDatafabricacao(Calendar.getInstance());

		Voo voo1 = new Voo();
		voo1.setOrigem("Rio Grande do Sul");
		voo1.setDestino("São Paulo");
		voo1.setDataHoraSaida(Calendar.getInstance());
		voo1.setDataHoraChegada(Calendar.getInstance());
		voo1.setPiloto(piloto);
		voo1.setAeronaves(Arrays.asList(a1, a2));

		Voo voo2 = new Voo();
		voo2.setOrigem("Rio Grande do Sul");
		voo2.setDestino("Rio de Janeiro");
		voo2.setDataHoraSaida(Calendar.getInstance());
		voo2.setDataHoraChegada(Calendar.getInstance());
		voo2.setPiloto(piloto);
		voo2.setAeronaves(Arrays.asList(a1));

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();
		em.persist(piloto);
		em.persist(a1);
		em.persist(a2);
		em.persist(voo1);
		em.persist(voo2);
		em.getTransaction().commit();

		em.close();

	}

}
