package com.lindi.project.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


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
}

	
	
	