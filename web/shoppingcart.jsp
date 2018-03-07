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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Invoice<br>


            Orders:<br>

            Topping = <%=topping%>. Bottom = <%=bottom%>.<br>
            Price = <%=price%><br>
            Old balance <%=balance%><br> 
            New balance <%=newBalance%><br>

            </form>
            <form action="homepage.jsp">
                <input type="submit" name="homepage" value="Change Order"> 
            </form>
            <form method="post" action="ShoppingCartController">
                <input type="submit" name="makeorder" value="Make order">

            </form>

        </h1>
    </body>
</html>
