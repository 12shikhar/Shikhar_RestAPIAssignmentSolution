package com.greatlearning.employeemanagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.repository.EmployeeRepository;
import com.greatlearning.employeemanagement.service.EmployeeDeleteService;

@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String deleteById(int id) {
		employeeRepository.deleteById(id);
		return "Library by this Id "+id+" is deleted";
	}

}
