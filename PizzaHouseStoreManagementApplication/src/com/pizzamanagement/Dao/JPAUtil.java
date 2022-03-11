package com.pizzamanagement.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	//creating factory object
	private static EntityManagerFactory factory;
	//creating entityManager object
	private static EntityManager entityManager;
	static {
		factory = Persistence.createEntityManagerFactory("juned");
	}
	public static EntityManager getEntityManager() {
	if(entityManager == null || !entityManager.isOpen()) {
		entityManager = factory.createEntityManager();
	}
	//returning entityManager
	return entityManager;
	}
}
