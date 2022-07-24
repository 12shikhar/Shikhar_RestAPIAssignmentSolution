package com.greatlearning.employeemanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.entity.Employee;
import com.greatlearning.employeemanagement.repository.EmployeeRepository;
import com.greatlearning.employeemanagement.service.EmployeeUpdateService;

@Service
public class EmployeeUpdateServiceImpl  implements EmployeeUpdateService {

	@Autowired
	EmployeeRepository updateRepository;
	
	@Override
	public Employee updateExistingEmployee(int id, Employee employee) {
		
		if(updateRepository.findById(id).isPresent()) {
			Employee existingEmployee = updateRepository.findById(id).get();
			
			existingEmployee.setFirstName(employee.getFirstName());
			existingEmployee.setLastName(employee.getLastName());
			existingEmployee.setEmail(employee.getEmail());
			
			Employee updatedEmployee = updateRepository.save(existingEmployee);
			
			return new Employee(updatedEmployee.getId(), updatedEmployee.getFirstName(), 
					updatedEmployee.getLastName(), updatedEmployee.getEmail());
		}else {
			return null;
		}
	}

}
