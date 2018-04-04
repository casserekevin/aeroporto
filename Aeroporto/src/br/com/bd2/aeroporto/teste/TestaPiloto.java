package br.com.bd2.aeroporto.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.bd2.aeroporto.modelo.Piloto;
import br.com.bd2.aeroporto.util.JPAUtil;

public class TestaPiloto {

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

		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();
		em.persist(piloto);
		em.getTransaction().commit();

		em.close();
	}

}
