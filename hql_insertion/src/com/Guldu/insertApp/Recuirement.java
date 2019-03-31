package com.Guldu.insertApp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Recuirement-table")
public class Recuirement implements Serializable {
	@Id
	private int id;
	private String name;
	private double citreria;

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

	public double getCitreria() {
		return citreria;
	}

	public void setCitreria(double citreria) {
		this.citreria = citreria;
	}

}
