package com.hexaware.servletjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Connection con=null;
	private static PreparedStatement pstmt=null;
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			con=DbConnection.getDBConnection();
			PrintWriter pw=resp.getWriter();
			if(con==null) {
				pw.println("no connection Established");
			}else {
				pw.println(" connection Established");
			}
			
			try {
				Integer logId = Integer.parseInt((req.getParameter("cusId")));
				String LogPassword = (req.getParameter("cusPassword"));
				pw.println(logId);
				pw.println(LogPassword);
				
				boolean acess=false;
				pstmt=con.prepareStatement("select * from customer where cusId=? and cusPassword=?");
				pstmt.setInt(1,logId);
				pstmt.setString(2,LogPassword );
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					if(logId==rs.getInt("cusId") && LogPassword.equals(rs.getString("cusPassword")) ) {
						
					pw.println("Login success");
					resp.sendRedirect("jsp/Product.jsp");
					}
				}else {
					pw.println("New customer- sign up ");
					resp.sendRedirect("jsp/SignUp.jsp");
				}
				
				

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
