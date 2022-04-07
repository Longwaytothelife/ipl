package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {
	@Id
	private int teamId;
	
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", tname=" + tname + ", points=" + points + ", ranking=" + ranking
				+ ", statistics=" + statistics + "]";
	}
	private String tname;
	private int points;
	private int ranking;
	private String statistics;
	
	
	
	public Team() {
		
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getStatistics() {
		return statistics;
	}
	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}
	

}
