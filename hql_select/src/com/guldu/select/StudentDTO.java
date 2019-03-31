package com.guldu.select;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student_table")
public class StudentDTO implements Serializable {
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Id
	@Column(name = "sid")
	private int id;
	@Column(name = "sname")
	private String name;
	@Column(name = "sperc")
	private double pdrc;

	public StudentDTO() {

	}

	public StudentDTO(String name, double pdrc) {
		super();
		this.name = name;
		this.pdrc = pdrc;
	}

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

	public double getPdrc() {
		return pdrc;
	}

	public void setPdrc(double pdrc) {
		this.pdrc = pdrc;
	}
}
