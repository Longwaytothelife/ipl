package com.controller;




import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.AdminDAO;
import com.model.Bidder;
import com.model.BidderDao;
import com.model.Match;
import com.model.MatchDao;
import com.model.Team;
import com.model.TeamDao;
import com.model.Tournaments;
import com.model.TournamentsDao;



@RestController
public class AdminController {
	
	@Autowired
	AdminDAO adminDAO;
	
	@Autowired
	TournamentsDao tournamentsDao;
	
	@Autowired
	TeamDao teamDao;
	
	@Autowired
	BidderDao bidderDao;
	
	@Autowired
	MatchDao matchDao;
	
	@PostMapping("/createTournaments")
	public String registerUser(@RequestBody  Tournaments tournaments) {
			tournamentsDao.save(tournaments);
			return "tournaments is created";
	}
	
	@DeleteMapping("/deleteTournament/{tournamentId}")
	public String deleteTournament(@PathVariable int tournamentId) {
		tournamentsDao.deleteById(tournamentId);
		return "tournament deleted";
	
	}
	
	@PostMapping("/addTeam")
	public String addTeam(@RequestBody Team team ) {
		teamDao.save(team);
		return "team is added";
	}
	
	@DeleteMapping("/deleteTeam/{teamId}")
	public String deleteTeam(@PathVariable int teamId) {
		teamDao.deleteById(teamId);
		return "team is deleted";
	
	}
	
	
	@PostMapping("/scheduleMatches")
	public Date addMatches(@RequestBody Match match ) {
		matchDao.save(match);
		return match.getDate();
		
	}
	
	@DeleteMapping("/cancelMatch/id")
	public String deleteMatch(@PathVariable int matchId) {
		matchDao.deleteById(matchId);
		return "match canceled";
	
	}
	
	
	
	/*@GetMapping("/viewBidders/{matchId}")
	public Optional<Bidder> showBidderDetails(@PathVariable int id ){
		return bidderDao.findById(id);
	}*/
}
