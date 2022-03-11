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







============================================Output========================================
Hibernate: insert into pizza (DeliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
Hibernate: insert into pizza (DeliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
	
	
	
practice=# select * from pizza;
 pizzano |        deliveryadd         | pizzaprice | pizzatype
---------+----------------------------+------------+-----------
      11 | sitapura sector-12, jaipur |        249 | Margeta
      12 | thane sector-17, mumbai    |        349 | Margeta
(2 rows)

	 
Hibernate: insert into pizza (DeliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
Hibernate: insert into pizza (DeliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
Hibernate: update pizza set DeliveryAdd=?, pizzaPrice=?, pizzaType=? where pizzaNo=?

	
practice=# select * from pizza;
 pizzano |        deliveryadd         | pizzaprice |  pizzatype
---------+----------------------------+------------+--------------
      12 | thane sector-17, mumbai    |        349 | Margeta
      11 | sitapura sector-12, jaipur |        270 | cheese pizza
(2 rows)


	 
Pizza No: 11
Pizza Type: Margeta
Pizza Price: 249
Pizza Dilevry Address: sitapura sector-12, jaipur



Hibernate: insert into pizza (DeliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
Hibernate: insert into pizza (DeliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
Hibernate: delete from pizza where pizzaNo=?
	
	
practice=# select * from pizza;
 pizzano |        deliveryadd         | pizzaprice | pizzatype
---------+----------------------------+------------+-----------
      11 | sitapura sector-12, jaipur |        249 | Margeta
(1 row)
