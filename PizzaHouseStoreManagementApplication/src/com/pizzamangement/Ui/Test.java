package com.pizzamangement.Ui;

import java.util.Scanner;

import com.pizzamanagement.model.Pizza;
import com.pizzamangement.service.PizzaService;
import com.pizzamangement.service.PizzaServiceImpl;

public class Test {
	public static void main(String[] args) {
		//creating object of PizzaService class
		PizzaService service = new PizzaServiceImpl();
//insert the pizza details
		Pizza pizza = new Pizza(11, "Margeta", 249, "sitapura sector-12, jaipur");
		Pizza pizza1 = new Pizza(12, "Margeta", 349, "thane sector-17, mumbai");
		service.addPizza(pizza);
		service.addPizza(pizza1);
//update
//		pizza = service.findPizzaByNo(11);
//		pizza.setPizzaType("cheese pizza");
//		pizza.setPizzaPrice(270);
//		service.addPizza(pizza);

//fetch
//		System.out.println("Pizza No: "+pizza.getPizzaNo());
//		System.out.println("Pizza Type: "+pizza.getPizzaType());
//		System.out.println("Pizza Price: "+pizza.getPizzaPrice());
//		System.out.println("Pizza Dilevry Address: "+pizza.getDeliveryAdd());
		
//delete
//		service.deletePizza(pizza1);
	}
}
