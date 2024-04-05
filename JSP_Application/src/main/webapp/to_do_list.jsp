<%@page import="java.util.ArrayList"%>
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
<form action="to_do_list.jsp" method="post">
      Add Item : <input type="text" name="toDo" id="" /> <br />
      <input type="submit" value="submit" />
      <br><br>
      Item Entered :<%=request.getParameter("toDo") %>
    </form>
    <%
    List<String> items=(List<String>)session.getAttribute("myToDoList");
    if(items==null)
    {
    	items=new ArrayList<String>();
    	session.setAttribute("myToDoList", items);
    }
    	
    	String theItem=request.getParameter("toDo");
    	if((theItem !=null)&&(!theItem.trim().equals("")))
    	{
    		items.add(theItem);
    	}
    
    %>
    
    <hr>
    <strong>To Do List Items Are :</strong>
    <ol>
    <%
    for(String temp : items)
    {
    	out.println("<li>"+temp+"</li>");
    	
    }
    %>
    </ol>
</body>
</html>