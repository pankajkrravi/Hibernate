package org.hibernate.onetoonebi.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="person_table")
public class PersonDTO implements Serializable 
{
	
	@Id
	@GenericGenerator(name="val",strategy="increment")
	@GeneratedValue(generator="val")
	@Column(name="p_Id")
	private int personId;
	@Column(name="p_name")
	private String personName;
	@Column(name="p_age")
	private double personAge;
	
	
	
	public PersonDTO() 
	{
		super();
	}



	public int getPersonId() {
		return personId;
	}



	public void setPersonId(int personId) {
		this.personId = personId;
	}



	public String getPersonName() {
		return personName;
	}



	public void setPersonName(String personName) {
		this.personName = personName;
	}



	public double getPersonAge() {
		return personAge;
	}



	public void setPersonAge(double personAge) {
		this.personAge = personAge;
	}
	
	
	
	
	
	
}
