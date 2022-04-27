package com.lindi.project.service;

import java.util.List;

import com.lindi.project.main.Reimbursements;

public interface ReimburseService {

	Reimbursements employeeReimb(Reimbursements request);
	
	Reimbursements employeeUpdate(Reimbursements reimb);
	
	List <Reimbursements> getAllReimbursements();
	
	List <Reimbursements> getReimbByEmp (int id);
}
