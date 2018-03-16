<%-- 
    Document   : registration
    Created on : 26-02-2018, 11:34:19
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
            <li><a href="login.jsp">Login</a></li>
        </ul>        
    <center><br><br>
        <img  src="image/cupcakep.png" alt="cupcake"  width="200" height="200"/>
        <link rel="stylesheet" type="text/css" href="Cupcakepic.css"> 
        <div align="center" frame="">
            <div class="Frame">


                <h1>Create a new Account</h1>
                <form  method="post" action="RegistrationController" >
                    New Username:
                    <input type="text" name="newuser"><br>
                    New Password:
                    <input type="password" name="newpass"><br>
                    Balance:
                    <input type="number" name="balance">  <br>
                    <button type="submit" name="regist" class="btn btn-primary">Register</button>
                </form>
                <form action="login.jsp">
                    <button type="submit" name="login" class="btn btn-primary">back to login</button>
                    </div>
                </form>
            </div>
            </body>
            </html>
