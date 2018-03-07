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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User Page</h1>
        <%
            //Henter user fra session
             HttpSession sesh = request.getSession();
             User user = (User) sesh.getAttribute("user");
             String name = user.getUsername();
             int balance = user.getBalance();             
        %>     
        
    <div>
    Customer - <%=name%>. Balance - <%=balance%>
    </div>
    
    <form action="logoutController">
            <input type="submit" name="logout" value="Logout">
    </form>
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
        Cupcake Toppings:
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
        
        <input type="submit" name="order" value="Order" >
        </form>
        <form action="orders.jsp" name="orders">
              <input type="submit" name="orders" value="View orders"
        </form>

    </body>
</html>
