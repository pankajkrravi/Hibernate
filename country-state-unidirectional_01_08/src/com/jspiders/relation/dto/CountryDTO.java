package com.jspiders.relation.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "country_table")
public class CountryDTO implements Serializable {

	public CountryDTO() {
		System.out.println(this.getClass().getSimpleName() + " obj Created");
	}

	@Id
	@GenericGenerator(name = "countryIdentifier", strategy = "increment")
	@GeneratedValue(generator = "countryIdentifier")
	@Column(name = "c_id")
	private int countryId;
	@Column(name = "c_name")
	private String countryName;
	@Column(name = "c_code")
	private long countryCode;
	@Column(name = "c_timezone")
	private String timeZone;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(long countryCode) {
		this.countryCode = countryCode;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

}
