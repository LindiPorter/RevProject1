package com.lindi.emp.daotests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.lindi.project.daos.LoginDAO;
import com.lindi.project.daos.LoginPostgresDAO;
import com.lindi.project.main.Employees;


@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class EmployeeDaoTests {

		private static LoginDAO dao = new LoginPostgresDAO();
		//private static Employees emp;
		
		@Test
		@Order(1)
		void getAllEmployees () {
			List<Employees> emptyList = new ArrayList<Employees> ();
			List<Employees> usedList = new ArrayList<Employees> ();
			usedList = dao.getAllEmployees();
			Assertions.assertNotEquals(emptyList, usedList);
		}
	
		@Test
		@Order(2)
		void getEmployeesById () {
			Employees emp = new Employees (101, "Lindi", "pass1", "emp1");
			List<Employees> emptyList = new ArrayList<Employees> ();
			List<Employees> usedList = new ArrayList<Employees> ();
			usedList = dao.getEmployeesById(emp.getId());
			Assertions.assertNotEquals(emptyList, usedList);
		}
}
