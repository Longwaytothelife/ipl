package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Bidder;
import com.model.BidderDao;
import com.model.Match;
import com.model.MatchDao;
import com.model.Team;
import com.model.TeamDao;

@RestController
public class BidderController {
	
	@Autowired
	BidderDao bidderDao;
	
	@Autowired
	MatchDao matchDao;
	
	@Autowired
	TeamDao teamDao;
	
	@PostMapping("/registeruser")
	public String registerUser(@RequestBody  Bidder bidder) {
			bidderDao.save(bidder);
			return "User Successfully Registered";
	}
	
	@GetMapping("/showmatchdetails/{matchId}")
	public Optional<Match> showMatchDetails(@PathVariable int matchId ){
		return matchDao.findById(matchId);
	}
	
	@PatchMapping("/changeTeam")
	public String changeTeam(@RequestBody Team team) {
		teamDao.save(team);
		return "team changed";
	}
	
	
	
	
	
	
	
	
	
	
}
