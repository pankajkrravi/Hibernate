package com.demoApp;

public class NewStusent {

	public NewStusent() {
		System.out.println("Default const !!!!");
	}

	NewStusent(int id, String name, String email) {

		this.id = id;
		this.name = name;
		this.email = email;

	}

	private int id;
	private String name;
	private String email;

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
}
