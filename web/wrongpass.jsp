<%-- 
    Document   : wrongpass
    Created on : 28-02-2018, 22:46:11
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
        <h1>Wrong Username / password!</h1>

        <form action="input.jsp">
            <input type="submit" name="login" value="Back to Login"> 
        </form>
        <form action="registration.jsp">
            <input type="submit" name="register" value="Register new user"> 
        </form>
    </body>
</html>
