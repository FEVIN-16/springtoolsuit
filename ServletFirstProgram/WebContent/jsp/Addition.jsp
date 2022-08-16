<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello From JSP</h1>
<h2>Today=<%=new Date() %></h2>
<%
	out.println("out from scriplet from jsp");
%>
<%
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(456);
	al.add(565);
	for(int i=0;i<al.size();i++){
		out.println(al.get(i));
	}
%>

</body>
</html>