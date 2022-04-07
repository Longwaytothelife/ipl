package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Bidder;
import com.model.BidderDao;

@RestController
public class BidderController {
	
	@Autowired
	BidderDao bidderDao;
	
	
	@PostMapping("/registeruser")
	public String registerUser(@RequestBody  Bidder bidder) {
			bidderDao.save(bidder);
			return "User Successfully Registered";
	}
	
	
	
}
