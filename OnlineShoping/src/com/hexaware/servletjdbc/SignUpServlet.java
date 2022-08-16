package com.hexaware.servletjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Connection con=null;
	private static PreparedStatement pstmt=null;
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			con=DbConnection.getDBConnection();
			try {
				
			
			PrintWriter pw=resp.getWriter();
			resp.setContentType("text/html");
			if(con==null) {
				pw.println("no connection established..");
			}
			
			
			pstmt=con.prepareStatement("insert into customer values(?,?,?,?,?)");
			
			int cusId=Integer.parseInt(req.getParameter("cusId"));
			String cusName=req.getParameter("cusName");
			String cusEmail=req.getParameter("cusEmail");
			String cusMobile=req.getParameter("cusMobile");
			String cusPassword=req.getParameter("cusPassword");
			
			pstmt.setInt(1,cusId);
			pstmt.setString(2, cusPassword);
			pstmt.setString(3, cusName);
			pstmt.setString(4, cusMobile);
			pstmt.setString(5, cusEmail );
			
			int i=pstmt.executeUpdate();
			if(i!=0) {
				pw.println("\"student added successfully....\"");
			}else {
				pw.println("student not added due to error...");
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
