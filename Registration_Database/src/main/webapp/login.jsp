<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type= "text/css" rel="stylesheet" href="css/login-page.css"></link>
</head>
<body>
	
  <div class="wrapper">
	  
    <form action="">
		
      <h1>Login</h1>
      
      <div class="input-box">
        <input type="text" placeholder="Username" required>
        <i class='bx bxs-user'></i>
      </div>
      
      <div class="input-box">
        <input type="password" placeholder="Password" required>
        <i class='bx bxs-lock-alt' ></i>
      </div>
      
      <div class="remember-forgot">
        <label><input type="checkbox">Remember Me</label>
        <a href="#">Forgot Password</a>
      </div>
      
      <button type="submit" class="btn"><a href="DataBaseController">Login</a></button>
      
      <div class="register-link">
		  
        <p>Dont have an account? <a href="regsister.jsp">Register</a></p>
        
      </div>
      
    </form>
  </div>
  
</body>
</html>