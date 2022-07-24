package com.greatlearning.employeemanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemanagement.entity.Employee;
import com.greatlearning.employeemanagement.repository.EmployeeRepository;
import com.greatlearning.employeemanagement.service.EmployeeReadService;


@Service
public class EmployeeReadServiceImpl implements EmployeeReadService {

	@Autowired
	EmployeeRepository readRepository;

	@Override
	public List<Employee> findAllEmployees() {
		return readRepository.findAll();
	}

	@Override
	public Optional<Employee> findEmployeeById(int id) {
		return readRepository.findById(id);
	}

	@Override
	public List<Employee> findEmployeeByFirstName(String firstName) {
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withMatcher("firstName", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id", "lastName", "email");
		 Example<Employee> example = Example.of(employee, exampleMatcher);
		return readRepository.findAll(example);
	}

	@Override
	public List<Employee> employeesSortedByFirstName(Direction direction) {
		return readRepository.findAll(Sort.by(direction, "firstName"));
	}

}
