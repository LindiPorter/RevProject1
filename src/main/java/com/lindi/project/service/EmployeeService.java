package com.lindi.project.service;

import java.util.List;

import com.lindi.project.main.Employees;

public interface EmployeeService {

	Employees loginEmployee (Employees emp);
	
	List<Employees> getAllEmployees();
	
	List<Employees> getEmployeesById(int eid);
}
