package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.LeaderBoard;
import com.model.LeaderBoardDao;


@RestController
public class LeaderController {
	
	@Autowired
	LeaderBoardDao leaderBoardDao;
	
	@PostMapping("/createLeaderBoard")
	public String createLeaderBoard(@RequestBody LeaderBoard leaderBoard) {
			leaderBoardDao.save(leaderBoard);
			return "leaderBoard is created";
	}
	
	
	

}
