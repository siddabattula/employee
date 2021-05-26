package com.app.employee.model;

import org.springframework.data.annotation.Id;

//@Entity
//@Table(name = "Employee")
public class Employee {

	@Id
	private String empId;
	//@Column
	private String empName;
	//@Column
	private String empSal;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSal() {
		return empSal;
	}
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	
	
	
	
}
