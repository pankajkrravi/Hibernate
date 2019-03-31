package org.jspiders.foodApp.dto;

import java.io.Serializable;

public class FoodDTO implements Serializable {

	public FoodDTO() {
		System.out.println("FoodDTO object created");
	}

	private String name;
	private int quantity;
	private double price;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FoodDTO [name=" + name + ", quantity=" + quantity + ", price=" + price + ", type=" + type + "]";
	}

	
}
