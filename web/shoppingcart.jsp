<%-- 
    Document   : price
    Created on : 01-03-2018, 11:42:06
    Author     : tobbe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Controller.*" %>
<!DOCTYPE html>

<%
    HttpSession sesh = request.getSession();
    int price = (Integer) sesh.getAttribute("price");
    User user = (User) sesh.getAttribute("user");
    int balance = user.getBalance();
    int newBalance = user.getBalance() - price;

    String topping = (String) sesh.getAttribute("topping");
    String bottom = (String) sesh.getAttribute("bottom");

%>
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
        <h1>Invoice<br>


            Orders:<br>

            Topping = <%=topping%>. Bottom = <%=bottom%>.<br>
            Price = <%=price%><br>
            Old balance <%=balance%><br> 
            New balance <%=newBalance%><br>

            </form>
            <form action="homepage.jsp">
                <button type="submit" name="homepage" class="btn btn-primary">Change Order</button>
            </form>
            <form method="post" action="ShoppingCartController">
                <button type="submit" name="makeorder" class="btn btn-primary">Make order</button>

            </form>

        </h1>
    </center>        
    </body>
</html>
