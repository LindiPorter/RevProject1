package com.lindi.project.service;

import java.util.List;

import com.lindi.project.daos.ReimburseDAO;
import com.lindi.project.main.Reimbursements;

public class ReimburseServiceLayer implements ReimburseService {

	private ReimburseDAO dao2; 
	
	public ReimburseServiceLayer  (ReimburseDAO dao2 ) {
		this.dao2 = dao2;
	}
	
	@Override
	public Reimbursements employeeReimb(Reimbursements request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reimbursements employeeUpdate(Reimbursements reimb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reimbursements> getAllReimbursements() {
		// TODO Auto-generated method stub
		return this.dao2.getAllReimbursements();
	}

	@Override
	public List<Reimbursements> getReimbByEmp(int id) {
		// TODO Auto-generated method stub
		return this.dao2.getReimbById(id);
	}

}
