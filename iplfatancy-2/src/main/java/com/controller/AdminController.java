package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;
import com.model.AdminDAO;



@RestController
public class AdminController {
	
	@Autowired
	AdminDAO adminDAO;
	
	
	
	

}
