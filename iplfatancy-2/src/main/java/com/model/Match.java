package com.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Match {
	@Id
	private int matchId;
	
	private String teamOne;
	
	private String teamTwo;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date date;
	private String stadium;
	
	private String winner;
	
public Match() {
		
	}

   

	public Match(int matchId, String teamOne, String teamTwo, Date date, String stadium, String winner) {
	super();
	this.matchId = matchId;
	this.teamOne = teamOne;
	this.teamTwo = teamTwo;
	this.date = date;
	this.stadium = stadium;
	this.winner = winner;
}



	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStadium() {
		return stadium;
	}
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", date=" + date
				+ ", stadium=" + stadium + ", winner=" + winner + "]";
	}
	

}