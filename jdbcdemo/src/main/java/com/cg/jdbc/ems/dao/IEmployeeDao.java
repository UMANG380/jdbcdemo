package com.cg.jdbc.ems.dao;

import com.cg.jdbc.ems.model.Employee;

import java.util.List;

import com.cg.jdbc.ems.exception.EmployeeException;

public interface IEmployeeDao {
	
	public Employee addEmployee(Employee employee) throws EmployeeException;
	public List<Employee> listAllEmployees() throws EmployeeException;
	
	
	
	

}
