package com.lindi.project.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lindi.project.main.Reimbursements;
import com.revature.p1.utils.ConnectionUtils;


public class ReimbursePostgresDAO implements ReimburseDAO {

	static Connection conn=ConnectionUtils.getInstance();
	@Override
	public void reimb(Reimbursements request) {
		// TODO Auto-generated method stub
		Reimbursements r = new Reimbursements ();
		PreparedStatement pstmt; 
		
		Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy");
        String today = formatter.format(date);
		
		try {
			pstmt = conn.prepareStatement("Insert into Reimbursement Values (DEFAULT,?,null,?,?,?,?::date)");
			pstmt.setInt(1, request.getEmployeeId());
			pstmt.setString(2, request.getRequest());
			pstmt.setDouble(3, request.getAmount());
			pstmt.setString(4, request.getDescription());
			pstmt.setString(5, today);
			pstmt.execute();
			pstmt.close();
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}
	
        
	@Override
	public void updateReimb(Reimbursements rUp) {
		// TODO Auto-generated method stub
		Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy");
        String today = formatter.format(date);
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("UPDATE reimbursement set manager_id=?, resolution_time=?::date, resolved=?, accepted=?  WHERE id=?");
			pstmt.setInt(1, rUp.getManagerId());
			pstmt.setString(2, today);
			pstmt.setString(3, rUp.getResolved());
			pstmt.setString(4, rUp.getAccepted());
			pstmt.setInt(5, rUp.getId());
			pstmt.execute();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	}
	
	@Override
	public List<Reimbursements> getAllReimbursements() {
		// TODO Auto-generated method stub
		List<Reimbursements> reList = new ArrayList<Reimbursements>();
		String getAllReimbursements = "SELECT * from reimbursement";

		try {
			PreparedStatement pstmt = conn.prepareStatement(getAllReimbursements);		
			ResultSet rs= pstmt.executeQuery();

			Reimbursements reimb;
			
			while (rs.next()) {
				int id = rs.getInt("id");
				int employeeId = rs.getInt("employee_id");
				int managerId = rs.getInt("manager_id");
				String request = rs.getString("request_type");
				Double amount = rs.getDouble("amount");
				String description = rs.getString("description");
				String resolved = rs.getString("resolved");
				String accepted = rs.getString("accepted");
				String resolutionTime = rs.getString("resolution_time");
				String submissionTime = rs.getString("submission_time");
				reimb = new Reimbursements(id, employeeId, managerId, request, amount, description, resolved, accepted, resolutionTime, submissionTime);
				reList.add(reimb);

		} } catch (SQLException e) {
			e.printStackTrace();
		}
		return reList;
	}


	@Override
	public List<Reimbursements> getReimbById(int rid) {
		// TODO Auto-generated method stub
		List<Reimbursements> reList = new ArrayList<Reimbursements>();

		
		try { String selectReimbursements = "SELECT * from reimbursement WHERE id=?";
			PreparedStatement pstmt = conn.prepareStatement(selectReimbursements);	
			pstmt.setInt(1, rid);
			ResultSet rs= pstmt.executeQuery();

			Reimbursements reimb;
			
			while (rs.next()) {
				int id = rs.getInt("id");
				int employeeId = rs.getInt("employee_id");
				int managerId = rs.getInt("manager_id");
				String request = rs.getString("request_type");
				Double amount = rs.getDouble("amount");
				String description = rs.getString("description");
				String resolved = rs.getString("resolved");
				String accepted = rs.getString("accepted");
				String resolutionTime = rs.getString("resolution_time");
				String submissionTime = rs.getString("submission_time");
				reimb = new Reimbursements(id, employeeId, managerId, request, amount, description, resolved, accepted, resolutionTime, submissionTime);
				reList.add(reimb);

		} } catch (SQLException e) {
			e.printStackTrace();
		}
		return reList;

	}


	
}


		