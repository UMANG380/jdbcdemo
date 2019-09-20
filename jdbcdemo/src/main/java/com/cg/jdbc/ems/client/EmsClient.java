package com.cg.jdbc.ems.client;

import java.math.BigDecimal;
import java.util.List;

import com.cg.jdbc.ems.dao.EmployeeDao;
import com.cg.jdbc.ems.dao.IEmployeeDao;
import com.cg.jdbc.ems.exception.EmployeeException;
import com.cg.jdbc.ems.model.Employee;

public class EmsClient {
	
	private static IEmployeeDao employeeDao;
	static {
		employeeDao = new EmployeeDao();
	}
	public static void main(String[] args) throws EmployeeException {
		Employee employee = new Employee();
		employee.setEmpname("Zara");
		employee.setEmpSal(BigDecimal.valueOf(9000.0));
		employee = employeeDao.addEmployee(employee);
		
		List<Employee> empList = employeeDao.listAllEmployees(); if(empList!=null) {
		empList.forEach(System.out::println); } else {
		System.out.println("No record found"); }
		
	}

}
