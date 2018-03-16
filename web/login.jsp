<%-- 
    Document   : input
    Created on : 26-02-2018, 11:37:54
    Author     : sidad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="background1.css">
        <link rel="stylesheet" type="text/css" href="bar.css"> 
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <li><a class="active" href="index.jsp">Home</a></li>
            <li><a href="registration.jsp">Register</a></li>
        </ul>
    <center>

        <h1 style="background-color:DodgerBlue;">Login!</h1>

        <form method="post" action="LoginController">
            Username:<br>
            <input type="text" name="user"><br>
            Password:<br>
            <input type="password" name="pass"><br>


            <button type="submit" name="login" class="btn btn-primary">login</button>
        </form>
        <form action="registration.jsp">
            <button type="submit" name="register" class="btn btn-primary">register new user</button>

        </form>

    </center>
</body>
</html>
