package com.greatlearning.employeemanagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.entity.Employee;
import com.greatlearning.employeemanagement.repository.EmployeeRepository;
import com.greatlearning.employeemanagement.service.EmployeeCreateService;

@Service
public class EmployeeCreateServiceImpl implements EmployeeCreateService {
	
	@Autowired
	EmployeeRepository createRepository;

	@Override
	public String addEmployee(Employee employee) {
		createRepository.save(employee);
		createRepository.flush();
		return "New Employee added successfully";
	}

}
