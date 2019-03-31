package org.jspider.btm.dto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="application_table")
public class ApplicationDto implements Serializable {
	public ApplicationDto() {
		System.out.println("Application object is created");
	}
	@Id
	@GenericGenerator(name="shiva",strategy="increment")
	@GeneratedValue(generator="shiva")
	@Column(name="application_id")
	private int id;
	@Column(name="application_name")
	private String name;
	@Column(name="application_version")
	private double version;
	@Column(name="application_type")
	private String type;
	
	@ManyToMany(cascade = {CascadeType.PERSIST , CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
	@JoinTable(name= "developer_application_table",
				joinColumns = @JoinColumn(name="a_id"),
				inverseJoinColumns = @JoinColumn(name="d_id"))
	private List<DeveloperDto> developersList;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<DeveloperDto> getDevelopersList() {
		return developersList;
	}
	public void setDevelopersList(List<DeveloperDto> developersList) {
		this.developersList = developersList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developersList == null) ? 0 : developersList.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		long temp;
		temp = Double.doubleToLongBits(version);
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
		ApplicationDto other = (ApplicationDto) obj;
		if (developersList == null) {
			if (other.developersList != null)
				return false;
		} else if (!developersList.equals(other.developersList))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (Double.doubleToLongBits(version) != Double.doubleToLongBits(other.version))
			return false;
		return true;
	}
}
