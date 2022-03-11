package com.pizzamanagement.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//table name is pizza using the Table annotation
@Table(name = "pizza")
public class Pizza {
	@Id
	private int pizzaNo;
	private String pizzaType;
	private int pizzaPrice;
	private String DeliveryAdd;
//generate getter and setters
	public int getPizzaNo() {
		return pizzaNo;
	}
	public void setPizzaNo(int pizzaNo) {
		this.pizzaNo = pizzaNo;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	public String getDeliveryAdd() {
		return DeliveryAdd;
	}
	public void setDeliveryAdd(String deliveryAdd) {
		DeliveryAdd = deliveryAdd;
	}
	//creating default constructor
	public Pizza() {

	}
	//creating parameterized constructor
	public Pizza(int pizzaNo, String pizzaType, int pizzaPrice, String deliveryAdd) {
		super();
		this.pizzaNo = pizzaNo;
		this.pizzaType = pizzaType;
		this.pizzaPrice = pizzaPrice;
		DeliveryAdd = deliveryAdd;
	}
	//generate toString method
	@Override
	public String toString() {
		return "Pizza [pizzaNo=" + pizzaNo + ", pizzaType=" + pizzaType + ", pizzaPrice=" + pizzaPrice
				+ ", DeliveryAdd=" + DeliveryAdd + "]";
	}
	
}
