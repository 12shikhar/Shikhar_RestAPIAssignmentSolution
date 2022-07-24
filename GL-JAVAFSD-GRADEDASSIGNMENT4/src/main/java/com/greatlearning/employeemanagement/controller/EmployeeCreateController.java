package com.greatlearning.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeemanagement.entity.Employee;
import com.greatlearning.employeemanagement.service.EmployeeCreateService;

@RestController
@RequestMapping("/createService")
public class EmployeeCreateController {
	
	@Autowired
	EmployeeCreateService createService;
	
	@PostMapping("/addEmployee")
	public String addEmployee(Employee employees) {
		return createService.addEmployee(employees);
	}

}
