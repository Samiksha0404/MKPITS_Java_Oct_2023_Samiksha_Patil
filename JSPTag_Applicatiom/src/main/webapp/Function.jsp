<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function</title>
</head>
<body>
   <c:set var="data" value="mkpits" />
   Length of the String <b>${data}</b> : ${fn:length(data)}
   <br><br>
   UpperCase Version of String <b>${data}</b> : ${fn.toUppercase(data)}
   <br><br>
   Does String <b>${data}</b> start with <b>mk</b>? : ${fn:startsWith(data,"mk")}
</body>
</html>