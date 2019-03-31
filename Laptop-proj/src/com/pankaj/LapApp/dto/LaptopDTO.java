package com.pankaj.LapApp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.omg.CORBA.PRIVATE_MEMBER;
@Entity
@Table(name = "laptop_table")
public class LaptopDTO implements Serializable {
	public LaptopDTO() {
		System.out.println("laptop dto object created");
	}
	@Id
	//to generate  id automatically
	@GenericGenerator(name="pankaj",strategy="increment")//generate primary key dynamically
	@GeneratedValue(generator="pankaj")//to initalize the data membewr @ with @id
	
	@Column(name = "l_id")//map pro to column
	private int id;
	@Column(name = "l_name")
	private String name;
	@Column(name = "l_price")
	private double price;
	@Column(name = "l_color")
	private String color;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
