<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h2>User Registration form</h2>
	
	<%
		String code=(String)request.getAttribute("code");
		String color="";
		String msg="";
		if(code!=null){
			switch(code){
			case "200" :
				color="green";
				msg="User Register Successfully..";
				break;
			case "500" :
				color="red";
				msg="User Registration fail. Try after some time..";
				break;
			}
		}
	%>
	
	<span>
		<font color="<%= color %>">
			<h4><%= msg %></h4>
		</font>
	</span>
	<form action="registerme" method="post">
		Enter Name : <input name="name"> <br><br>
		Enter Email : <input name="email"> <br><br>
		Enter Password : <input type="password" name="password"> <br><br>
		Enter Contact : <input name="contact"> <br><br>
		Select Gender : <input type="radio" value="male" name="gender"> Male 
						<input type="radio" value="female" name="gender"> Female
						<br><br>
						
		<input type="submit" value="Register">
		<input type="reset">
	</form>
</body>
</html>