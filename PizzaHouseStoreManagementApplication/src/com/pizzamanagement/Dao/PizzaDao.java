package com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;

public interface PizzaDao {
	//access the Pizza data
	Pizza getPizzaByNo(int pizzaNo);
	public void addPizza(Pizza pizza);
	public void updatePizza(Pizza pizza);
	public void deletePizza(Pizza pizza);
	void beginTransaction();
	void commitTransaction();
}
