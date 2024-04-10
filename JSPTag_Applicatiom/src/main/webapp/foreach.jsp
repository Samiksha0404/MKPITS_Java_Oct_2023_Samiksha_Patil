<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//create  some sample data.... normally it is provided by MVC 
String[] cities = {"Mumbai", "Nagpur", "pune"};
pageContext.setAttribute("myCities", cities);
%>
<c:forEach var="tempCity" items= "${myCities}">
${tempCity}
<br>
</c:forEach>
</body>
</html>