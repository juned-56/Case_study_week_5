package com.pizzamanagement.Dao;

import javax.persistence.EntityManager;

import com.pizzamanagement.model.Pizza;

public class PizzaDaoImpl implements PizzaDao{
	//creating entityManager object
	private EntityManager entityManager;
	//default constructor of PizzaDaoImpl
	public PizzaDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public void addPizza(Pizza pizza) {
		entityManager.persist(pizza);
	}
	@Override
	public void updatePizza(Pizza pizza) {
		entityManager.merge(pizza);
		
	}
	@Override
	public void deletePizza(Pizza pizza) {
		entityManager.remove(pizza);
	}
	@Override
	public Pizza getPizzaByNo(int pizzaNo) {
		Pizza pizza = entityManager.find(Pizza.class, pizzaNo);
		return pizza;
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
}
