package com.jspiders.relation.dto;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "state_table")
public class StateDTO implements Serializable {

	public StateDTO() {
		System.out.println(this.getClass().getSimpleName() + " obj Created");
	}

	@Id
	@GenericGenerator(name = "statePrimaryKey", strategy = "increment")
	@GeneratedValue(generator = "statePrimaryKey")
	@Column(name = "s_id")
	private int stateId;
	@Column(name = "s_name")
	private String stateName;
	@Column(name = "s_population")
	private long population;

	@ManyToOne(cascade = { 
						CascadeType.PERSIST, 
						CascadeType.MERGE, 
						CascadeType.REFRESH, 
						CascadeType.DETACH })
	@JoinColumn(name = "country_id")
	private CountryDTO country;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public CountryDTO getCountry() {
		return country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

}
