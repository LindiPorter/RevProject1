package com.lindi.project.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lindi.project.main.Employees;
import com.revature.p1.utils.ConnectionUtils;

public class LoginPostgresDAO implements LoginDAO {
	static Connection conn = ConnectionUtils.getInstance();

	@Override
	public Employees employeeLogin1(Employees login) {
		// TODO Auto-generated method stub
		Employees emp = new Employees();
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * from logins");
			ResultSet rs= pstmt.executeQuery();
			String username = login.getUsername();
			String password = login.getPassword();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String pass = rs.getString("passwrd");
				String user = rs.getString("username");
				String type = rs.getString("type");
			if (user.equals(username) && pass.equals(password)) { 
				emp.setId(id);
				emp.setUsername(username);
				emp.setPassword(password);
				emp.setType(type);
				break;
			}
}

		} catch (SQLException e) {
			e.printStackTrace();
		} return emp;
}

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employees> empList = new ArrayList<Employees> ();
		String getAllEmployees = "SELECT * from logins";
		
		try {  PreparedStatement pstmt = conn.prepareStatement(getAllEmployees);
		ResultSet rs = pstmt.executeQuery();
		Employees emps;
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String username = rs.getString("username");
			String password = rs.getString("passwrd");
			String type = rs.getString("type");
			emps = new Employees (id, username, password, type);
			empList.add(emps);
		} } catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empList;
	}

	@Override
	public List<Employees> getEmployeesById(int eid) {
		// TODO Auto-generated method stub
		List<Employees> empList = new ArrayList <Employees>();
		String selectEmployees = "SELECT * from logins WHERE id=?";
		try { PreparedStatement pstmt = conn.prepareStatement(selectEmployees);	
		pstmt.setInt(1, eid);
		ResultSet rs= pstmt.executeQuery();
		Employees emps; 
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String username = rs.getString("username");
			String password = rs.getString("passwrd");
			String type = rs.getString("type");
			emps = new Employees (id, username, password, type);
			empList.add(emps);
		} }  catch (SQLException e) {
			e.printStackTrace();
	
		} return empList;
	}
}


	
	
	