package com.controller;

import java.util.Optional;

import javax.persistence.PostUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Bidder;
import com.model.BidderDao;
import com.model.LeaderBoard;
import com.model.LeaderBoardDao;
import com.model.Match;
import com.model.MatchDao;
import com.model.Team;
import com.model.TeamDao;
import com.model.Tournaments;

@RestController
public class BidderController {
	
	@Autowired
	BidderDao bidderDao;
	
	@Autowired
	MatchDao matchDao;
	
	@Autowired
	TeamDao teamDao;
	
	@Autowired
	LeaderBoardDao leaderBoardDao;
	
	@PostMapping("/registeruser")
	public String registerUser(@RequestBody  Bidder bidder) {
			bidderDao.save(bidder);
			return "User Successfully Registered";
	}
	
	@GetMapping("/showmatchdetails/{matchId}")
	public Optional<Match> showMatchDetails(@PathVariable int matchId ){
		return matchDao.findById(matchId);
	}
	
	@GetMapping("/viewLeaderBoard/{bidderId}")
	public Optional<LeaderBoard> viewLeaderBoard(@PathVariable int bidderId) {
		return leaderBoardDao.findById(bidderId);
	}
	
	@GetMapping("/viewPointsTable/{teamId}")
	public Optional<Team>viewPointsTable(@PathVariable int teamId){
		return teamDao.findById(teamId);
	}
	
	/*@PatchMapping("/selectTeam/{teamId}")
	public O*/
	
	
	
	
	
	
	
	
}
