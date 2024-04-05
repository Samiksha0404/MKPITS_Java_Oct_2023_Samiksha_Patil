<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Expression of JSP</h2>
 The Time on Server is : <%= new Date()%><br>
 Converting String to Upper Case : <%= new String("hello").toUpperCase() %><br>
 25 Multiplied by 4 = <%=25*4 %><br>
 Is 75 less than 69 : <%= 75< 69 %>
</body>
</html>