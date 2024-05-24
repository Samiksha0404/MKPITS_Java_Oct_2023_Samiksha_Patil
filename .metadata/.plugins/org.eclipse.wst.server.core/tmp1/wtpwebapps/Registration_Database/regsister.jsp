<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
    /* Style the form container */
    .container {
      max-width: 500px;
      margin: auto;
      padding: 20px;
      border: 3px solid black;
      height: 630px ;
      background-color: transparent ;
      backdrop-filter: blur(30px);
    }
    body {
      width:100%;
      height:100%;
      background-image: url('img/balloon.jpg');
      background-size: cover;
      background-position: center;
      background-attachment: fixed; 
     
    }

    /* Style the input fields */
    input {
      width: 100%;
      padding: 12px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      box-sizing: border-box;
      height:30px;
      
    }
    form{
    width: 100%;
    height:80%;

    }

    /* Style the submit button */
    input[type=submit] {
      background-color: #4CAF50;
      color: white;
      padding: 14px 20px;
      margin: 8px 0;
      border: none;
      cursor: pointer;
      width: 100%;
      height:40px;
    }
    select{
    width: 100%;
    height: 30px;}

    /* Style the submit button on hover */
    input[type=submit]:hover {
      color: black;
    }

    #gender{
    margin-top:8px}
  </style>
</head>
<body>

<div class="container">

  <h2 align="center">Enter your Details</h2>
  
  <form action="DataBaseController"  method ="get">
  
    <label for="Name"> Name</label>
    <input type="text" id="first" name="Name" placeholder="Your full name..">
<br>
    <label for="Email">Email</label>
    <input type="email" id="first" name="Email" placeholder="abc@gmail.com">
    <br>
    <label for="Mobile">Mobile</label>
    <input type="text" id="first" name="Mobile" placeholder="1234567890">
<br>

    <label for="City">City</label>
    <input type="text" id="first" name="City" placeholder="Enter your city">
    <br>
    
    <label for="Age">Age</label>
    <input type="text" id="first" name="Age" placeholder="Enter your age">
    <br>
    
    <label class="distance" for="Gender">Gender</label><br>
    <select id="gender" name="gender" required>
          <option value=" " > -select your gender- </option>
          <option value="male">Male</option>
          <option value="female">Female</option>
          <option value="Lesbian">Lesbian</option>
          <option value="Gay">Gay</option>
          <option value="Other">Other</option>
          </select><br />
 
    <br>
    <label for="Password">Password</label>
    <input type="password" id="first" name="Password" placeholder="">
    <br>
    <label for="first">Confirm Password</label>
    <input type="password" id="first" name="first" placeholder="Re-enter the above password">
<br>
    <input type="submit" value="Submit">
  </form>
</div>

</body>

</html>