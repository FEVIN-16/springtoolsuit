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
	<form  style="border:2px solid black;background-color: #b0bec5; width:50% ;" method="post" >
		<h1>New customer please:Sign Up</h1>
		<label style="font-weight: bold;">
			Id:<input style="font-weight: bold;width:200px;border-radius:5px;margin-left:40px"type="number" name="cusId"  required>
		</label><br><br>
		<label style="font-weight: bold;">
			Name:<input style="font-weight: bold;width:200px;border-radius:5px;margin-left:17px"type="text" name="cusName" required>
		</label><br><br>
		<label style="font-weight: bold;">
			Email:<input style="font-weight: bold;width:200px;border-radius:5px;margin-left:17px"type="text" name="cusEmail"  required>
		</label><br><br>
		<label style="font-weight: bold;">
			Mobile:<input style="font-weight: bold;width:200px;border-radius:5px;margin-left:13px"type="text" name="cusMobile"  required>
		</label><br><br>
		<label style="font-weight: bold;">
			Password:<input style="font-weight: bold;width:200px;border-radius:5px;margin-left:7px"type="text" name="cusPassword"  required>
		</label><br><br>
		<br>
		<input style="font-weight: bold;width:100px;border-radius:5px" type="submit" value="submit" name="add" formaction="<%=request.getContextPath() %>/SignUpServlet">
		<br><br><br><br>
	</form>
	</div>
</body>
</html>