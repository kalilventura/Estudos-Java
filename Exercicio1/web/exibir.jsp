<%-- 
    Document   : exibir
    Created on : 26/09/2018, 20:14:04
    Author     : internet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nome e Sobrenome</title>
    </head>
    <body>
        <%
           String r = (String)request.getAttribute("resultado");
           out.print("Resultado: " + r);
        %>
    </body>
</html>
