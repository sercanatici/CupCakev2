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
        <title>JSP Page</title>
    </head>
    <body>

        <%=mylist%>


        <form action="homepage.jsp" name="homepage">
            <input type="submit" name="homepage" value="Back to homepage"
        </form>

    </body>
</html>
