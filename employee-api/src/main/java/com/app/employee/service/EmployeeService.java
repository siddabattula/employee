package com.app.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employee.model.Employee;
import com.app.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void doRegister(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public Iterable<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee searchEmployee(String empId) {
		return employeeRepository.findOne(empId);
	}
	
	public void deleteEmployee(String empId) {
		employeeRepository.delete(empId);
	}
}
