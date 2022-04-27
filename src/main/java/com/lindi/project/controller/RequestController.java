package com.lindi.project.controller;

import java.util.List;

import com.lindi.project.daos.LoginDAO;
import com.lindi.project.daos.LoginPostgresDAO;
import com.lindi.project.daos.ReimburseDAO;
import com.lindi.project.daos.ReimbursePostgresDAO;
import com.lindi.project.main.Employees;
import com.lindi.project.main.Reimbursements;


import io.javalin.http.Handler;

public class RequestController {
	static ReimburseDAO dao = new ReimbursePostgresDAO();
	static LoginDAO dao1 = new LoginPostgresDAO();

	public static Handler employeeLogin = ctx -> {
		Employees emp1 = ctx.bodyAsClass(Employees.class);
		Employees emp2 = dao1.employeeLogin1(emp1);
		ctx.sessionAttribute("sAtt", emp2.getId());
		int sAtt = ctx.sessionAttribute("sAtt");
		System.out.println(sAtt);
		ctx.json(emp2);
	};

	public static Handler getAllEmployees = ctx -> {
		List<Employees> empList = dao1.getAllEmployees();
		ctx.json(empList);
	};

	public static Handler getEmployeesById = ctx -> {
		int id = Integer.parseInt(ctx.pathParam("id"));
		List<Employees> empList = dao1.getEmployeesById(id);
		ctx.json(empList);
	};

	public static Handler employeeRequest = ctx -> {
		int sAtt = ctx.sessionAttribute("sAtt");
		Reimbursements request1 = ctx.bodyAsClass(Reimbursements.class);
		System.out.println(sAtt);
		dao.reimb(request1, sAtt);
	};

	public static Handler employeeUpdate = ctx -> {
		int sAtt = ctx.sessionAttribute("sAtt");
		System.out.println(sAtt);
		Reimbursements r1 = ctx.bodyAsClass(Reimbursements.class);
		dao.updateReimb(r1, sAtt);
	};

	public static Handler getAllReimbursements = ctx -> {
		List<Reimbursements> reList = dao.getAllReimbursements();
		ctx.json(reList);
	};

	public static Handler getReimbByEmp = ctx -> {
		int rid = ctx.sessionAttribute("sAtt");
		System.out.println(rid);
		List<Reimbursements> reList1 = dao.getReimbById(rid);
		ctx.json(reList1);
	};

}


