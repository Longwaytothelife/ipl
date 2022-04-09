package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Match;
import com.model.MatchDao;

@RestController
public class MatchController {
	
	@Autowired
	MatchDao matchDao;

}
