package com.lindi.emp.daotests;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.lindi.project.daos.ReimburseDAO;
import com.lindi.project.daos.ReimbursePostgresDAO;
import com.lindi.project.main.Reimbursements;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ReimburseDaoTests {

	private static ReimburseDAO dao = new ReimbursePostgresDAO ();
	private static Reimbursements reimburse;
	@Test
	@Order(1)
	void reimb () {
		Reimbursements r1 = new Reimbursements (100, 101, 201, "car", 500, "idk", "no", "no", "date", "date");
		dao.reimb(r1, 0);
		ReimburseDaoTests.reimburse=r1;
		Assertions.assertEquals(100, reimburse.getId());
	} 
	
	@Test
	@Order(2)
	void updateReimb () {
		Reimbursements r1 = new Reimbursements (100, 101, 201, "car", 500, "idk", "no", "no", "date", "date");
		dao.updateReimb(r1, 100);
		ReimburseDaoTests.reimburse=r1;
		Assertions.assertEquals(r1, reimburse);
}
	
	@Test
	@Order(3)
	void getAllReimbursements () {
		List<Reimbursements> emptyList = new ArrayList<Reimbursements> ();
		List<Reimbursements> usedList = new ArrayList<Reimbursements> ();
		usedList = dao.getAllReimbursements();
		Assertions.assertNotEquals(emptyList, usedList);
	}   
	
	@Test
	@Order(4)
	void getReimbById () {
		Reimbursements r1 = new Reimbursements (1, 101, 201 , "office supplies", 56, "hey", "resolved", "deny", "2022-04-22", "2022-04-02");
		List<Reimbursements> emptyList = new ArrayList<Reimbursements> ();
		List<Reimbursements> usedList = new ArrayList<Reimbursements> ();
		usedList = dao.getReimbById(r1.getId());
		Assertions.assertEquals(emptyList, usedList);
	}
}
