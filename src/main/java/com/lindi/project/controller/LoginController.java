package com.lindi.project.controller;

import com.lindi.project.daos.LoginDAO;
import com.lindi.project.daos.LoginPostgresDAO;
import com.lindi.project.main.Employees;

import io.javalin.http.Handler;

public class LoginController {
static LoginDAO dao = new LoginPostgresDAO ();

	
	public static Handler employeeLogin = ctx -> {
		Employees emp1 = ctx.bodyAsClass(Employees.class);
		Employees emp2 = dao.employeeLogin1(emp1);
		ctx.json(emp2);
	};
}
