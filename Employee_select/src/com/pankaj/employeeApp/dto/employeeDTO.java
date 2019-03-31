package com.pankaj.employeeApp.dto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "emp_table")
public class employeeDTO implements Serializable {
	@Id
	@Column(name = "e_id")
	private int eid;
	@Column(name = "e_name")
	private String ename;
	@Column(name = "e_sal")
	private double esal;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

}
