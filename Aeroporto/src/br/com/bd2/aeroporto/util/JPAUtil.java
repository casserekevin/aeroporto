package br.com.bd2.aeroporto.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("aeroporto");

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
