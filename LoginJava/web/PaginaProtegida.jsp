<%-- 
    Document   : PaginaProtegida
    Created on : 30/04/2019, 17:49:00
    Author     : p051461
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(session.getAttribute("Login").equals(null)){
                response.sendRedirect("index.html");
            }
        %>
        <h1>Página Protegida</h1>
    </body>
</html>
