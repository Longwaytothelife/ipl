package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Bidder {
	
	@Id
	private int id;
	private String userName;
	private String password;
	@Override
	public String toString() {
		return "Bidder [id=" + id + ", userName=" + userName + ", password=" + password + ", Name=" + Name + ", email="
				+ email + ", phoneNo=" + phoneNo + "]";
	}
	private String Name;
	private String email;
	private String phoneNo;
	
	
	
	public Bidder() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}