package org.jspider.btm.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="developer_table")
public class DeveloperDto implements Serializable {
	
	public DeveloperDto() {
    System.out.println("Object created");
	}
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="developer_id")
	private int id;
	@Column(name="d_name")
	private String name;
	@Column(name="d_skill")
	private String skill;
	@Column(name="d_years_Of_Exp")
	private double yearsOfExperience;
	
	@ManyToMany(mappedBy = "developersList", cascade = {CascadeType.PERSIST , CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
	private List<ApplicationDto> listOfApplications;

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

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public double getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public List<ApplicationDto> getListOfApplications() {
		return listOfApplications;
	}

	public void setListOfApplications(List<ApplicationDto> listOfApplications) {
		this.listOfApplications = listOfApplications;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((listOfApplications == null) ? 0 : listOfApplications.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((skill == null) ? 0 : skill.hashCode());
		long temp;
		temp = Double.doubleToLongBits(yearsOfExperience);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		DeveloperDto other = (DeveloperDto) obj;
		if (id != other.id)
			return false;
		if (listOfApplications == null) {
			if (other.listOfApplications != null)
				return false;
		} else if (!listOfApplications.equals(other.listOfApplications))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (skill == null) {
			if (other.skill != null)
				return false;
		} else if (!skill.equals(other.skill))
			return false;
		if (Double.doubleToLongBits(yearsOfExperience) != Double.doubleToLongBits(other.yearsOfExperience))
			return false;
		return true;
	}

}
