<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h3>Traning</h3>
 <!-- Read the favorite language from cookies -->
 
 <%
 // the default --- if there are no cookies
 String favLang = "Java";
 
 // get cookies from the browser
 Cookie[] theCookies = request.getCookies();
 
 // find your favorite Language cookies
 if(theCookies != null){
	 for(Cookie tempCookie : theCookies){
		 if("myApp.favoriteLanguage".equals(tempCookie.getName())){
			 favLang= tempCookie.getValue();
			 break;
		 }
	 }
 }
 %>
 <!--Now show a personalise page---use the "favLang" variable -->
 <!-- Show new Books for this lang -->
 <h4>
  New BOOKS For
 <%=favLang%> 
 </h4>
 <ul>
 <li>Hello Boss </li>
 <li>Hello Boss </li>
 <li>Hello Boss </li>
 </ul>
 
  <h4>
 Latest New Report For
 <%=favLang%> 
 </h4>
 <ul>
 <li>Hello Boss </li>
 <li>Hello Boss </li>
 <li>Hello Boss </li>
 </ul>
 
  <h4>
  New Job For
 <%=favLang%> 
 </h4>
 <ul>
 <li>Hello Boss </li>
 <li>Hello Boss </li>
 <li>Hello Boss </li>
 </ul>
 
 <br><br>
 <a href="cookies_personalise_response">Personalise This Page</a>
 
 
</body>
</html>