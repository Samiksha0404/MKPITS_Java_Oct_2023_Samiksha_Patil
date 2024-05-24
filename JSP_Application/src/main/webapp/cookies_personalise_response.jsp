<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookies</title>
</head>
<body>
<%
/* Read Form Data */
 String favLang = request.getParameter("favoriteLanguage");

// creat the cookies
Cookie theCookie = new Cookie("myApp.favoriteLanguage", favLang);

// Set the life span
theCookie.setMaxAge(60*60*24*365); //for year

// send cookies to the browser
response.addCookie(theCookie);
		
%>
Thank You! we set your Favorite Language to : ${param.favoriteLanguage}

<br><br>
<a href="cookie_homepage.jsp"> Home_Page</a>

</body>
</html>