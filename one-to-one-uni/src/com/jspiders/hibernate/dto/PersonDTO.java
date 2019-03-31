package com.jspiders.hibernate.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "person_table")
public class PersonDTO implements Serializable {

	public PersonDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@Id
	@GenericGenerator(name = "jsp", strategy = "increment")
	@GeneratedValue(generator = "jsp")
	@Column(name = "p_id")
	private int personId;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_mobile_number")
	private long mobileNumber;
	@Column(name = "p_age")
	private double age;

	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private AadharDTO aadhar;
	
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public AadharDTO getAadhar() {
		return aadhar;
	}

	public void setAadhar(AadharDTO aadhar) {
		this.aadhar = aadhar;
	}

}
