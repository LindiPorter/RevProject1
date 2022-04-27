package com.lindi.project.daos;

import java.util.List;

import com.lindi.project.main.Reimbursements;


public interface ReimburseDAO {
	

	void reimb(Reimbursements request, int sAtt);
	
	void updateReimb (Reimbursements rUp, int sAtt);
	
	List<Reimbursements> getAllReimbursements();
	

	List<Reimbursements> getReimbById(int id);


}
