package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees(); 
	
	void deleteEmployeeBySsn(String ssn);
}
