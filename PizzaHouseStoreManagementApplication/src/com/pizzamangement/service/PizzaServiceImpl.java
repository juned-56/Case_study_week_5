package com.pizzamangement.service;

import com.pizzamanagement.Dao.PizzaDao;
import com.pizzamanagement.Dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;
//implements the PizzaService
public class PizzaServiceImpl implements PizzaService{
	//creating Dao object to access the data
	private PizzaDao Dao;
	//creating default constructor of PizzaServiceImpl
	public PizzaServiceImpl() {
		//initialize the Dao object 
		Dao = new PizzaDaoImpl();
	}
	//implements the methods
	@Override
	public void addPizza(Pizza pizza) {
		//begin Transaction
		Dao.beginTransaction();
		Dao.addPizza(pizza);
		//commit Transaction
		Dao.commitTransaction();
	}
	@Override
	public void updatePizza(Pizza pizza) {
		Dao.beginTransaction();
		Dao.updatePizza(pizza);
		Dao.commitTransaction();
		
	}
	@Override
	public void deletePizza(Pizza pizza) {
		Dao.beginTransaction();
		Dao.deletePizza(pizza);
		Dao.commitTransaction();
		
	}
	@Override
	public Pizza findPizzaByNo(int pizzaNo) {
		Pizza pizza = Dao.getPizzaByNo(pizzaNo);
		return pizza;
	}
	
}
