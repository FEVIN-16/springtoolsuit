<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form style="border:2px solid black;background-color: #b0bec5; width:50% ;"action="<%=request.getContextPath() %>/LoginServlet" method="post">
			<h1>Login Page</h1><br><br>
			<label style="font-weight: bold;"> Id:<input style="font-weight: bold;width:200px;border-radius:5px;margin-left:40px" type="number" name="cusId"></label><br><br>
			<label style="font-weight: bold;">Password:<input style="font-weight: bold;width:200px;border-radius:5px;margin-left:7px"type="text" name="cusPassword"></label><br><br>
			<input style="font-weight: bold;width:100px;border-radius:5px" type="submit" value="submit" ><br><br>
		</form>
	</div>
</body>
</html>