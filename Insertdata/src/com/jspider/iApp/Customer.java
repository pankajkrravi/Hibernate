package com.jspider.iApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.*;
import org.jboss.jandex.Main;
import com.jspiders.hibernate.util.HibernateUtil;

@Entity
@Table(name = "customer")

public class Customer {
	@Id
	@Column(name = "cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	@Column(name = "cplace")
	private String cpalce;
	@Column(name = "csal")
	private double csal;

	public String getCname() {
		return cname;
	}

	public void setCname(int cid, String cname, String cpalce, double csal) {
		this.cid = cid;
		this.cname = cname;
		this.cname = cname;
		this.csal = csal;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCpalce() {
		return cpalce;
	}

	public void setCpalce(String cpalce) {
		this.cpalce = cpalce;
	}

	public double getCsal() {
		return csal;
	}

	public void setCsal(double csal) {
		this.csal = csal;
	}

	public Customer(String cname, int cid, String cpalce, double csal) {

		this.cname = cname;
		this.cid = cid;
		this.cpalce = cpalce;
		this.csal = csal;
	}
	/*
	 * public static void main(String[] args) { Transaction tx = null; try {
	 * SessionFactory factory = HibernateUtil.getSessionFactory(); Session
	 * session = factory.openSession(); tx = session.beginTransaction();
	 * Customer cs = new Customer("pankaj", 12, "Bangalore", 52021.12);
	 * session.save(cs); session.close(); tx.commit();
	 * System.out.println("Record inserted"); } catch (Exception e) {
	 * e.printStackTrace(); if (tx != null) tx.rollback(); } }
	 */
}
