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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Please fill out all the register columns!</h1>
        
        <form action="registration.jsp">
         <input type="submit" name="register" value="Back to registration"> 
        
        </form>
        <form action="input.jsp">
         <input type="submit" name="login" value="Back to login"> 
        
        </form>
    </body>
</html>
