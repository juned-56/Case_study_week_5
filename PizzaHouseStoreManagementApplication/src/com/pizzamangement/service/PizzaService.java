package com.pizzamangement.service;

import com.pizzamanagement.model.Pizza;

public interface PizzaService {
	//creating the pizza methods or services
	public void addPizza(Pizza pizza);
	public void updatePizza(Pizza pizza);
	public void deletePizza(Pizza pizza);
	Pizza findPizzaByNo(int pizzaNo);
}
