package com.lindi.project.main;

public class Employees {
	
	// Variables
	
	private int id;
	private String username; 
	private String password;
	private String type;
	
	// Getters and Setters
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	// Default Constructor
	
	public Employees() {
		super();
	}
	 
	// Parameterized Constructor
	
	public Employees(int id, String username, String password, String type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.type = type;
	}
	
	// To String Method
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", username=" + username + ", password=" + password + ", type=" + type
				+ "]";
	} 
	
	

}
