package com.lindi.project.daos;

import java.util.List;

import com.lindi.project.main.Employees;


public interface LoginDAO {

	Employees employeeLogin1(Employees login);
	
	List<Employees> getAllEmployees();
	
	List<Employees> getEmployeesById(int eid);

}
