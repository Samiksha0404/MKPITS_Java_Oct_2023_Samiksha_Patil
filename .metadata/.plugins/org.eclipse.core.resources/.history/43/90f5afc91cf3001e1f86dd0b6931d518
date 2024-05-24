<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
The Student is confirm : ${param.fName} ${param.lname}
<br> Student Country is : ${param.country}
<br> Favourite Language is: ${param.favLangauage}
<ul>
<%
String[] hobbies = request.getParameterValues("hobbies");
for(String temp :  hobbies)
{
	out.println("<li>" + temp + "</ li>");
}
%>
</ul>
</body>
</html>