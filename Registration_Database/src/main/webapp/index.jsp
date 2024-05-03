<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Home Page</title>
  <style>
    /* Style the navigation bar */
    .navbar {
      overflow: hidden;
      background-color: #333;
      display: flex;
      justify-content: end;
      
    }

    /* Navigation links */
    .navbar a {
      float: right;
      display: block;
      color: #f2f2f2;
      text-align: center;
      padding: 14px 20px;
      text-decoration: none;
    }

    /* Change color on hover */
    .navbar a:hover {
      background-color: #ddd;
      color: black;
    }

    /* Active/current link */
    .navbar a.active {
      color: #ddd;
      background-color: #333;
    }
    .navbar a.active:hover {
      background-color: #ddd;
      color: black;
    }
    /* Login button */
    .login-btn {
      float: right;
      background-color: #2abdd3;
      border: none;
      color: white;
      padding: 14px 20px;
      text-align: center;
      text-decoration: none;
      display: inline-block;
      font-size: 16px;
      margin: 0px;
      cursor: pointer;
    }

    /* Style the login button on hover */
    .login-btn:hover {
      background-color: #2abdd3;
    }
  </style>
</head>
<body>
  
  <!-- Navigation bar -->
  <div class="navbar">
    <a class="active" href="#home">Home</a>
    <a href="#about">About</a>
    <a href="#contact">Contact</a>
    <button class="login-btn" onclick="window.location.href = 'login.jsp'">Login</button>
  </div>

  <!-- Page content -->
  <div style="padding: 20px">
    <br />
    <br />
    <h1>Homepage</h1>
  </div>
</body>
</html>
