package org.hibernate.onetoonebi.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="aadhar_table")
public class AadharDTO implements Serializable
{
	@Id
	@GenericGenerator(name="val1",strategy="increment")
	@GeneratedValue(generator="val1")
	@Column(name="a_id")
	private int aadharId;
	@Column(name="a_address")
	private String address;
	@Column(name="a_state")
	private String state;


	public AadharDTO()
	{
		System.out.println(this.getClass().getSimpleName());
	}


	public int getAadharId() 
	{
		return aadharId;
	}


	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}




}
