package com.greatlearning.employeemanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	

}
