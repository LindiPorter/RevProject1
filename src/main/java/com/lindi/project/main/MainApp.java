package com.lindi.project.main;

import java.sql.Connection;


import com.lindi.project.controller.RequestController;
import com.revature.p1.utils.ConnectionUtils;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class MainApp {
public static void main(String[] args) {
	
	Javalin app = Javalin.create(
			ctx->{ctx.enableCorsForAllOrigins(); ctx.addStaticFiles("web", Location.CLASSPATH);}
			).start();
	
	app.before(ctx -> ctx.header("Access-Control-Allow-Credentials", "true"));
	
	
	app.post("/login", RequestController.employeeLogin);
	
	app.get("/employees", RequestController.getAllEmployees);
	
	app.get("/employees/{id}", RequestController.getEmployeesById);
	
	app.post("/request", RequestController.employeeRequest);
	
	app.put("/update", RequestController.employeeUpdate);
	
	app.get("/reimbursements", RequestController.getAllReimbursements);
	
	app.get("/reimbemp", RequestController.getReimbByEmp);
			
	Connection conn= ConnectionUtils.getInstance();
	Connection conn2= ConnectionUtils.getInstance();
	System.out.println(conn);
	System.out.println(conn2);
}
}
