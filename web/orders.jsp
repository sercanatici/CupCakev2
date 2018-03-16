<%-- 
    Document   : orders
    Created on : 01-03-2018, 12:13:49
    Author     : tobbe
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Controller.*" %>


<%
    HttpSession sesh = request.getSession();
    ArrayList<Order> orderlist = new ArrayList();
    if (sesh.getAttribute("orderlist") != null) {

    orderlist = (ArrayList<Order>) sesh.getAttribute("orderlist");
    }
    String mylist = "hej";

    if (orderlist.isEmpty()) {
        mylist = "No order have been made";
    } else {
        mylist = orderlist.toString();
    }
%>
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
        <%=mylist%>


        <form action="homepage.jsp" name="homepage">
            <button type="submit" name="homepage" class="btn btn-primary">Back to homepage</button>
        </form>

    </center>
    </body>
</html>
