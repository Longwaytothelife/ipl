package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {
	@Id
	private String firstTeam;
	private String secondTeam;
	private String thirdTeam;
	
	
	
	
	public Result() {
		
	}
	public String getFirstTeam() {
		return firstTeam;
	}
	public void setFirstTeam(String firstTeam) {
		this.firstTeam = firstTeam;
	}
	public String getSecondTeam() {
		return secondTeam;
	}
	public void setSecondTeam(String secondTeam) {
		this.secondTeam = secondTeam;
	}
	public String getThirdTeam() {
		return thirdTeam;
	}
	public void setThirdTeam(String thirdTeam) {
		this.thirdTeam = thirdTeam;
	}
 

}
