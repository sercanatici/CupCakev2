<%-- 
    Document   : error_reg_empty
    Created on : 28-02-2018, 21:22:12
    Author     : tobbe
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
        </ul>
    <center>
        <h1>Please fill out all the register columns!</h1>

        <form action="registration.jsp">
            <button type="submit" name="register" class="btn btn-primary">Back to registration</button> 

        </form>
        <form action="login.jsp">
            <button type="submit" name="login" class="btn btn-primary">Back to login</button>

        </form>
    </center>
</body>
</html>
