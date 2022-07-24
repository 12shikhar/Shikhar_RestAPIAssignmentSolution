package com.greatlearning.employeemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.employeemanagement.entity.Employee;
import com.greatlearning.employeemanagement.service.EmployeeReadService;

@RestController
@RequestMapping("/readService")
public class EmployeeReadController {
	
	@Autowired
	EmployeeReadService readService;
	
	@GetMapping("/findAllEmployees")
	public List<Employee> findAllEmployees() {
		return readService.findAllEmployees();
	}
	
	@GetMapping("/findEmployeeById")
	public Optional<Employee> findEmployeeById(int id) {
		return readService.findEmployeeById(id);
	}
	
	@GetMapping("/findEmployeeByFirstName")
	public List<Employee> findEmployeeByFirstName(String firstName) {
		return readService.findEmployeeByFirstName(firstName);
	}
	
	@GetMapping("/employeesSortedByFirstName")
	public List<Employee> employeesSortedByFirstName(Direction direction) {
		return readService.employeesSortedByFirstName(direction);
	}
}
