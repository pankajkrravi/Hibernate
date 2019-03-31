package com.jspiders.relation.dto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<StateDTO> listOfStates;
	
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

	public List<StateDTO> getListOfStates() {
		return listOfStates;
	}

	public void setListOfStates(List<StateDTO> listOfStates) {
		this.listOfStates = listOfStates;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (countryCode ^ (countryCode >>> 32));
		result = prime * result + countryId;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((listOfStates == null) ? 0 : listOfStates.hashCode());
		result = prime * result + ((timeZone == null) ? 0 : timeZone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDTO other = (CountryDTO) obj;
		if (countryCode != other.countryCode)
			return false;
		if (countryId != other.countryId)
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (listOfStates == null) {
			if (other.listOfStates != null)
				return false;
		} else if (!listOfStates.equals(other.listOfStates))
			return false;
		if (timeZone == null) {
			if (other.timeZone != null)
				return false;
		} else if (!timeZone.equals(other.timeZone))
			return false;
		return true;
	}

}
