package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.model.AdminDAO;

@RestController
public class AdminController {
	
	@Autowired
	AdminDAO adminDAO;
	
	
	
	

}
