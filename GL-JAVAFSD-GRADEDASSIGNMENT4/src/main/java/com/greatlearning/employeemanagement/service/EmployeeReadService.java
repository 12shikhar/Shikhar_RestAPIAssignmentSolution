package com.greatlearning.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort.Direction;

import com.greatlearning.employeemanagement.entity.Employee;

public interface EmployeeReadService {

	List<Employee> findAllEmployees();
	
	Optional<Employee> findEmployeeById(int id);
	
	List<Employee> findEmployeeByFirstName(String firstName);
	
	List<Employee> employeesSortedByFirstName(Direction direction);

}