<%-- 
    Document   : homepage
    Created on : 27-02-2018, 21:13:43
    Author     : sidad
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Controller.*" %>
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
            <li><a class="active" href="logoutController">Logout</a></li>
        </ul>
    <center>
        <h1>User Page</h1>
        <%
            //Henter user fra session
             HttpSession sesh = request.getSession();
             User user = (User) sesh.getAttribute("user");
             String name = user.getUsername();
             int balance = user.getBalance();             
        %>     
        
    <div>
    Customer name: <%=name%><br> Balance: <%=balance%>
    </div>
        <h1>Choose your cupcake:</h1>
        Cupcake Bottom:
        
        <form method="post" action="OrderController">
        <select name="choiceB"> 
            <option value="Chocolate" name="b1">Chocolate -,5</option>
            <option value="Vanilla" name="b2">Vanilla -,5</option>
            <option value="Nutmeg" name="b3">Nutmeg -,5</option>
            <option value="Pistacio" name="b4">Pistacio -,6</option>
            <option value="Almond" name="b5">Almond -,7</option>

        </select> <br> <br>
        Cupcake Toppings:<br>
        <select name="choiceT"> 
            <option value="Chocolate" name="t1">Chocolate -,5</option>
            <option value="Blueberry" name="t2">Blueberry -,5</option>
            <option value="Raspberry" name="t3">Raspberry -,5</option>
            <option value="Crispy" name="t4">Crispy -,6</option>
            <option value="Strawberry" name="t5">Strawberry -,6</option>
            <option value="Rum/Raisin" name="t6">Rum/Raisin -,7</option>
            <option value="Orange" name="t7">Orange -,8</option>
            <option value="Lemon" name="t8">Lemon -,8</option>
            <option value="Bluecheese" name="t9">BlueCheese -,9</option>
        </select> <br> <br>
        
        <button type="submit" name="order" class="btn btn-primary">Order</button>
        </form>
        <form action="orders.jsp" name="orders">
              <button type="submit" name="orders" class="btn btn-primary">View orders</button>
        </form>

    </center>        
    </body>
</html>
