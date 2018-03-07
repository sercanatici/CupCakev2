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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create a new Account</h1>
        <form  method="post" action="RegistrationController">
            New Username:
            <input type="text" name="newuser"><br>
            New Password:
            <input type="password" name="newpass"><br>
            Balance:
            <input type="number" name="balance">  <br>
            <input type="submit" value="Register" name="regist">
            
            
            
           
        </form>
        <form action="input.jsp">
            <input type="submit" name="login" value="back to login"> 
        
        </form>
    </body>
</html>
