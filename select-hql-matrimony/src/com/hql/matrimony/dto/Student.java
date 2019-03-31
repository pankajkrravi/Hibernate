package com.hql.matrimony.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student implements Serializable {
	@Id
	@Column(name = "sid")
	private int id;
	@Column(name = "sname")
	private String name;
	@Column(name = "sperc")
	private double perc;

	public Student() {
		System.out.println(this.getClass().getSimpleName());

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

	public double getPerc() {
		return perc;
	}

	public void setPerc(double perc) {
		this.perc = perc;
	}

}
