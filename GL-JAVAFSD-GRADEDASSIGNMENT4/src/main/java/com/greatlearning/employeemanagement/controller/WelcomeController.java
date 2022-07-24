package com.greatlearning.employeemanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/")
	public String handleWelcome() {
		return "Welcome to Employee Management";
	}

}
