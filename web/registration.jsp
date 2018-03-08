<%-- 
    Document   : registration
    Created on : 26-02-2018, 11:34:19
    Author     : sidad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            div.Frame {
                position: relative;
                width: 300px;
                height: 250px;
                border: 10px solid #6f3806;
                background-color: #323200;
            }
            body {
                color: #7291c3;
            }
            div.menu{
                position: relative;
                width: 100%;
                height: 100%;
                border: 10px solid #6f3806;
                background-color: #323200;
            }

            body{
                background-color: brown;
            }
            
            #navbar{
                width: 100%;
                height: 70%;
                background-color: black;
                color: white;
                
                #linkref{
                 color: white;
                 text-decoration: none;
                 padding: 15px;
                    
                    
                }
                
            }
        </style>
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <div id="navbar">
              <a href="index.jsp" id="linkref"> Start</a>
              <a href="input.jsp" id="linkref"> Login</a>
              <a href="registration.jsp" id="linkref">Register</a>
        </div>  
        
        <div class="menu" align="center">
            <img  src="image/logo.png" alt="cupcake"  width="450" height="450"/>
        </div>
        
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
                    <input type="submit" value="Register" name="regist">
                </form>
                <form action="input.jsp">
                    <input type="submit"  name="login" value="back to login"> 

                    </div>
                </form>
            </div>
    </body>
</html>
