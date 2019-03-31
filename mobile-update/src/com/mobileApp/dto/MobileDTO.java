package com.mobileApp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "mobile_table")
public class MobileDTO implements Serializable {
	public MobileDTO() {
		System.out.println("Mobile object is created!!!");
	}

	@Id
	@GenericGenerator(name = "asdf", strategy = "increment")
	@GeneratedValue(generator = "asdf")
	@Column(name = "mid")
	private int mid;
	@Column(name = "mname")
	private String mname;
	@Column(name = "mcname")
	private String companyname;
	@Column(name = "mprice")
	private double mprice;

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

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public double getMprice() {
		return mprice;
	}

	public void setMprice(double mprice) {
		this.mprice = mprice;
	}

}
