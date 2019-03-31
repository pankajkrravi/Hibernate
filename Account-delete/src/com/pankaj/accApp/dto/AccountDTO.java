package com.pankaj.accApp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "account_table")
public class AccountDTO implements Serializable{
	public AccountDTO() {
		System.out.println("Account object is created!!!!");
	}

	@Id
	@GenericGenerator(name = "pk", strategy = "increment")
	@GeneratedValue(generator = "pk")
	@Column(name = "id")
	private int id;
	@Column(name = "uname")
	private String username;
	@Column(name = "password")
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
