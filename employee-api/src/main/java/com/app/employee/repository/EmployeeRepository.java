package com.app.employee.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.employee.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Serializable> {
	
	
}
/*
 * public interface EmployeeRepository extends CrudRepository<Employee,
 * Serializable> {
 * 
 * 
 * }
 */
