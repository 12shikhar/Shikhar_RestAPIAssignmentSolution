package com.greatlearning.employeemanagement.service;

import com.greatlearning.employeemanagement.entity.Employee;

public interface EmployeeUpdateService {
	
	 Employee updateExistingEmployee(int id, Employee employee);

}
