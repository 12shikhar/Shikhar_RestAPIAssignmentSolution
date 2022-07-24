package com.greatlearning.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeemanagement.service.EmployeeDeleteService;

@RestController
@RequestMapping("/deleteService")
public class EmployeeDeleteController {
	
	@Autowired
	EmployeeDeleteService deleteService;
	
	@DeleteMapping("/deleteById")
	public String deleteById(int id) {
		return deleteService.deleteById(id);
	}

}
