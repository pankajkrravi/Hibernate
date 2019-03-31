package com.pankaj.studyApp;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "student_table")
public class Student implements Serializable {
	@Id
	private int sid;
	private String sname;
	private double sperc;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSperc() {
		return sperc;
	}

	public void setSperc(double sperc) {
		this.sperc = sperc;
	}

}
