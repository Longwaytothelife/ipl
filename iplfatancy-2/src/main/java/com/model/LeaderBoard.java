package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LeaderBoard {
	
	@Id
	@GeneratedValue
	private int bidderId;
	private int bidsParticipated;
	private int bidsWon;
	private int bidsLost;
	private double percentile;
	private int bidder_ranking;
	
	
	
	
	public LeaderBoard() {
		
	}
	
	
	public int getBidderId() {
		return bidderId;
	}
	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}
	public int getBidsParticipated() {
		return bidsParticipated;
	}
	public void setBidsParticipated(int bidsParticipated) {
		this.bidsParticipated = bidsParticipated;
	}
	public int getBidsWon() {
		return bidsWon;
	}
	public void setBidsWon(int bidsWon) {
		this.bidsWon = bidsWon;
	}
	public int getBidsLost() {
		return bidsLost;
	}
	public void setBidsLost(int bidsLost) {
		this.bidsLost = bidsLost;
	}
	public double getPercentile() {
		return percentile;
	}
	public void setPercentile(double percentile) {
		this.percentile = percentile;
	}
	public int getBidder_ranking() {
		return bidder_ranking;
	}
	public void setBidder_ranking(int bidder_ranking) {
		this.bidder_ranking = bidder_ranking;
	}

}
