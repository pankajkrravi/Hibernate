package com.jspiders.hibernate.dto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "food_table")
public class FoodDTO implements Serializable {

	public FoodDTO() {
		System.out.println("FoodDTO object created!");
	}
	@Id
	@Column(name = "food_id")
	private int foodId;
	@Column(name = "food_name")
	private String name;
	@Column(name= "food_type")
	private String type;
	@Column(name = "food_price")
	private double price;
	@Column(name = "food_quantity")
	private int quantity;

	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
