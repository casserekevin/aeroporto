package br.com.bd2.aeroporto.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.bd2.aeroporto.modelo.Piloto;
import br.com.bd2.aeroporto.util.JPAUtil;

public class TestaBuscaPiloto {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		Piloto piloto = new Piloto();
		piloto.setId(1);

		String jpql = "select p from Piloto p where p = :pPiloto";

		Query query = em.createQuery(jpql);
		query.setParameter("pPiloto", piloto);

		List<Piloto> resultados = query.getResultList();

		for (Piloto p : resultados) {
			System.out.println("id: " + p.getId());
			System.out.println("Número do Brevê: " + p.getNumBreve());
			System.out.println("Nome: " + p.getNome());
			System.out.println("Horas de Vôo: " + p.getHorasVoo() + "\n");
		}
	}

}
