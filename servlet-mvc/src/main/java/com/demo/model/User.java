package com.demo.model;

public class User {

	private Long id;
	private String userName;

	public User() {

	}

	public User(Long id, String userName) {
		this.id = id;
		this.userName = userName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
