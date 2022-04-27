package com.lindi.project.service;

import java.util.List;

import com.lindi.project.daos.LoginDAO;
import com.lindi.project.main.Employees;

public class EmpServiceLayer implements EmployeeService {

	private LoginDAO dao1; 
	
	public EmpServiceLayer (LoginDAO dao1) {
		this.dao1 = dao1;
	}
	
	@Override
	public Employees loginEmployee(Employees emp) {
		// TODO Auto-generated method stub
		return this.dao1.employeeLogin1(emp);
	}

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return this.dao1.getAllEmployees();
	}

	@Override
	public List<Employees> getEmployeesById(int eid) {
		// TODO Auto-generated method stub
		return this.dao1.getEmployeesById(eid);
	}

}
