<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mkpits.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student data</title>
</head>
<body>
<%
List<Student> data= new ArrayList<Student>();
     data.add(new Student("Vinay","thawre",false));
     data.add(new Student("Vinay","thawre",true));
pageContext.setAttribute("myStudent",data);
%>
<c:forEach var="tempStudent" items="${myStudent}">
${tempStudent.firstName}
${tempStudent.lastName}
${tempStudent.premium}<br>
</c:forEach>
</body>
</html>