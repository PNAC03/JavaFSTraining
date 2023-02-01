package com.lpu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.lpu.client2.Employee;

public class jdbcwithmysql {
	
Connection con;
public void sqlexec() {
		try {
			con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hr", "root", "ADMIN");
			System.out.println(con);
			Statement stmt = con.createStatement();
			String sql = "select * from employees;";
			boolean success = stmt.execute(sql);
			System.out.println(success);
			ResultSet rs = con.createStatement().executeQuery(sql);
			List lstEmp = new LinkedList();
			
			while(rs.next()) {
				String name = rs.getString(2) + " " + rs.getString(2);
				Employee emp = new Employee(name, rs.getInt(1), rs.getDouble("salary"));
				lstEmp.add(emp);
				System.out.println(rs.getInt(1)+ " " + rs.getString(2));
				System.out.println(lstEmp.size());
			}
			}
		catch(SQLException e){
			e.printStackTrace();
			}
		finally {
			try {
			con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
public void insert() {
	try {
		con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/hr", "root", "ADMIN");
		System.out.println(con);
		Statement stmt = con.createStatement();
		String sql = "insert into regions values(7,'New7')";
		boolean success =stmt.execute(sql);
		System.out.println(success);
		} catch (SQLException e) {
		e.printStackTrace();
	}
}

public void insertWithParams(int regID, String regName) {
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "ADMIN");
		System.out.println(con);
		String sql = "insert into regions values(?,?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, regID);
		ps.setString(2, regName);
		ps.execute();
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		}catch(SQLException e) {
		e.printStackTrace();
		}
	}
}
	
public static void main(String[] args) {
	jdbcwithmysql obj = new jdbcwithmysql();
	obj.sqlexec();
	obj.insert();
	obj.insertWithParams(10, "new");
}
}
