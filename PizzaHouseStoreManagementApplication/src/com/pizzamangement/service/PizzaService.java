package com.pizzamangement.service;

import com.pizzamanagement.model.Pizza;

public interface PizzaService {
	//creating the pizza methods or services
	//add pizza
	public void addPizza(Pizza pizza);
	//update pizza
	public void updatePizza(Pizza pizza);
	//delete pizza
	public void deletePizza(Pizza pizza);
	//find pizaa
	Pizza findPizzaByNo(int pizzaNo);
}
