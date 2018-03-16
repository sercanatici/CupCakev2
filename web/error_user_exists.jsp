<%-- 
    Document   : error_user_exists
    Created on : 28-02-2018, 13:12:48
    Author     : tobbe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Username already exists</h1>
        <form action="registration.jsp">
            <input type="submit" name="register" value="Register new user"> 
        </form>
        <form action="login.jsp">
            <input type="submit" name="login" value="Login with existing user"> 
        </form>
    </body>
</html>
