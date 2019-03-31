package com.jspiders.hibernate.dto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "alcohol_table")
public class AlcohalDTO implements Serializable {
	@Id
	@GenericGenerator(name = "my", strategy = "increment")
	@GeneratedValue(generator = "my")
	@Column(name = "Alco_id")
	private int id;
	@Column(name = "Alco_name")
	private String name;
	@Column(name = "Alco_price")
	private Double price;
	@Column(name = "Alco_type")
	private String type;
	@Column(name = "Alco_quantity")
	private int quantity;

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "AlcohalDTO [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + ", quantity="
				+ quantity + "]";
	}

}
