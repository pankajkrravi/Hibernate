package com.pankaj.Demoapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "movie_table")
public class MovieDTO implements Serializable {
	public MovieDTO() {
		System.out.println("movie object is created!!!");
	}

	@Id
	@GenericGenerator(name = "movie", strategy = "increment")
	@GeneratedValue(generator = "movie")
	private int mid;
	@Column(name = "m_name")
	private String mname;
	@Column(name = "m_cast")
	private String mcast;
	@Column(name = "m_budget")
	private double mbudget;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMcast() {
		return mcast;
	}

	public void setMcast(String mcast) {
		this.mcast = mcast;
	}

	public double getMbudget() {
		return mbudget;
	}

	public void setMbudget(double mbudget) {
		this.mbudget = mbudget;
	}

}
