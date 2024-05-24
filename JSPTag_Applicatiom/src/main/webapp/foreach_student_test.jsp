<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList, com.mkpits.model.Student"%>
<%@page import="java.util.List"%>
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
     //create some sample data 
     //List<Student> data = new ArrayList<Student>();
   List<Student> data = new ArrayList<Student>();
   data.add(new Student("Vinay","Thaware" ,false));
   data.add(new Student("pranav","armarkar" ,true));
   data.add(new Student("raj","warhokar" ,false));
   data.add(new Student("kaustubh","anjankar" ,false));
   
   pageContext.setAttribute("myStudent", data);
    %>
    <table border="1">
    <tr>
    <thead>
    
    <th>first Name</th>
    <th>last Name</th>
    <th>Gold Customer</th>
    
    </thead>
    </tr>
    
    <c:forEach var="tempStudent" items="${myStudent}">
    
    <tr>
    
     <td> ${tempStudent.firstName}</td>
     <td> ${tempStudent.lastName}</td>
     <td> <c:if test="${tempStudent.isgoldCustomer}">Special Discount</c:if> 
          <c:if test="${not tempStudent.isgoldCustomer}">------</c:if>
     </td>
     </tr>
    </c:forEach>
    </table>
</body>
</html>