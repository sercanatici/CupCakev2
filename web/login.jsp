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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login!</h1>
         
        <form method="post" action="LoginController">
            Username:<br>
            <input type="text" name="user"><br>
            Password:<br>
            <input type="password" name="pass"><br>
           
        
            <input type="submit" name="login" value="login" > 
        </form>
        <form action="registration.jsp">
            <input type="submit" name="register" value="register new user"> 
        
        </form>
        
    </body>
</html>
