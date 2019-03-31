<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor="cyan">
<pre>
	<form action="reg.do" method="post">
		Name: 		<input type="text" name="name"> <br>
		Password: 	<input type="password" name="password"> <br>
		Contact No: 	<input type="text" name="contactNumber"> <br>
		Email Id: 	<input type="email" name="emailId"> <br>
		Gender: 	<input type="radio" name="gender" value="M"> M
				<input type="radio" name="gender" value="F"> F
				<input type="radio" name="gender" value="Others"> Others
				
					<input type="submit" value="Register">
	</form>
</pre>
</body>
</html>