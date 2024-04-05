<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
 <h2>Hello World Of JSP</h2>
 The Time on Server is : <%= new Date()%><br>
 Converting String to Upper Case : <%= new String("hello").toUpperCase() %><br>
 25 Multiplied by 4 = <%=25*4 %><br>
 Is 75 less than 69 : <%= 75< 69 %>
 
 <%
 for(int index =0 ; index<5;index++){
	 out.println("<br> I reaaly Love JSP Code");
 }
 %>
 
</body>
</html>