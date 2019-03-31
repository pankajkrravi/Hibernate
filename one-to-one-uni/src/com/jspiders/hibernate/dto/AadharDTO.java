package com.jspiders.hibernate.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "aadhar_table")
public class AadharDTO implements Serializable {

	@Id
	@GenericGenerator(name = "jsp", strategy = "increment")
	@GeneratedValue(generator = "jsp")
	@Column(name = "aadhar_id")
	private long aadharId;
	@Column(name = "address")
	private String address;
	@Column(name = "tag_line")
	private String tagline;

	@OneToOne(cascade = CascadeType.ALL) //java side relation
	@JoinColumn(name = "person_id") //db side relation
	private PersonDTO person;

	public AadharDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public long getAadharId() {
		return aadharId;
	}

	public void setAadharId(long aadharId) {
		this.aadharId = aadharId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public PersonDTO getPerson() {
		return person;
	}

	public void setPerson(PersonDTO person) {
		this.person = person;
	}

}
