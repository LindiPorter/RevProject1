package com.lindi.project.controller;

import java.util.List;

import com.lindi.project.daos.ReimburseDAO;
import com.lindi.project.daos.ReimbursePostgresDAO;
import com.lindi.project.main.Reimbursements;


import io.javalin.http.Handler;

public class RequestController {
		static ReimburseDAO dao = new ReimbursePostgresDAO ();

			
			public static Handler employeeRequest = ctx -> {
				Reimbursements request1 = ctx.bodyAsClass(Reimbursements.class);
				dao.reimb(request1);
			};
			
			public static Handler employeeUpdate = ctx -> {
				Reimbursements r1 = ctx.bodyAsClass(Reimbursements.class);
				dao.updateReimb(r1);
			};
			
			public static Handler getAllReimbursements = ctx -> {
				List<Reimbursements> reList = dao.getAllReimbursements();
				ctx.json(reList);
			};
			
			public static Handler getReimbByEmp = ctx -> {
				int rid = Integer.parseInt(ctx.pathParam("id"));
				List<Reimbursements> reList1 = dao.getReimbById(rid);
				ctx.json(reList1);
			};
		}






