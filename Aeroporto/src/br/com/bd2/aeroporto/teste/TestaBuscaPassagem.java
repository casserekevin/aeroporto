package br.com.bd2.aeroporto.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.bd2.aeroporto.modelo.Passagem;
import br.com.bd2.aeroporto.modelo.Voo;
import br.com.bd2.aeroporto.util.JPAUtil;

public class TestaBuscaPassagem {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		Voo voo = new Voo();
		voo.setId(1);

		String jpql = "select p from Passagem p where p.voo = :pVoo";

		Query query = em.createQuery(jpql);
		query.setParameter("pVoo", voo);

		List<Passagem> resultados = query.getResultList();

		for (Passagem p : resultados) {
			System.out.println("id: " + p.getId());
			System.out.println("Forma de Pagamento: " + p.getFormaPagamento());
			System.out.println("Meio de Pagamento: " + p.getMeioPagamento());
			System.out.println("Valor: " + p.getValor());
			System.out.println("Poltrona: " + p.getPoltrona() + "\n");
		}

	}

}
