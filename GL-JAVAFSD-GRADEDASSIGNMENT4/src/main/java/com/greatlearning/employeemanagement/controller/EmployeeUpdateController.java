package com.greatlearning.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeemanagement.entity.Employee;
import com.greatlearning.employeemanagement.service.EmployeeUpdateService;

@RestController
@RequestMapping("/updateService")
public class EmployeeUpdateController {

	@Autowired
	EmployeeUpdateService updateService;
	
	  
	  @PostMapping("/updateExistingEmployee") public Employee
	  updateExistingEmployee(int id, Employee employee) { return
	  updateService.updateExistingEmployee(id, employee); 
	  }

}
