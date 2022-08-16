package com.hexaware.servletjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static Connection con=null;
	
public static Connection getDBConnection() {
		
		//Register the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish DB Connection
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshoping", "root", "root");
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
