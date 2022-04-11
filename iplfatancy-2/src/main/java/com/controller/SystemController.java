package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.LeaderBoard;
import com.model.LeaderBoardDao;
import com.model.Match;
import com.model.MatchDao;
import com.model.Team;
import com.model.TeamDao;



@RestController
public class SystemController {
	
	@Autowired
	MatchDao matchDao;
	
	@Autowired
	LeaderBoardDao leaderBoardDao;
	
	
	@Autowired
	TeamDao teamDao;
	
	@PatchMapping("/updateTeamStatistics")
	public String updateTeamStatistics(@RequestBody Team team) {
		teamDao.save(team);
		return "team Statistics are updated";
	}
	
	
	@PatchMapping("/updateLeaderBoard")
	public String updateLeaderBoard(@RequestBody LeaderBoard leaderBoard) {
		leaderBoardDao.save(leaderBoard);
		return "leaderBoard is updated";
	}
	
	/*@GetMapping("/declareResult")
	public String declareResult(@RequestBody Match match ){
		return match.getWinner();
	}**/
	

}
