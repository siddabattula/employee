package com.app.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.employee.model.Employee;
import com.app.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	// to create new employee
		@PostMapping("/save-emp")
		public void doRegister(@RequestBody Employee employee) {
			employeeService.doRegister(employee);
		}
	
	// to retrieve all employee details
	@GetMapping("/all-employees")
	public Iterable<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	// to retrieve single employee details
	@GetMapping("/search/{empId}")
	public Employee searchEmployee(@PathVariable String empId) {
		return employeeService.searchEmployee(empId);
	}
	
	// to delete employee details
	@DeleteMapping("/delete/{empId}")
	public void deleteEmployee(@PathVariable String empId) {
		employeeService.deleteEmployee(empId);
	}

}
