<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Declaration of JSP</h2>

<%!
public String makeItLower(String data){
	return data.toLowerCase();
}
%>

The String in Lower Case is : <%= makeItLower("MKPITS") %><br>

<%!
public void makeItLower(){
	
	
}
%>

<%= getData() %>
</body>
</html>