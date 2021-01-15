<%-- 
    Document   : GeraCookie
    Created on : 30/04/2019, 08:12:09
    Author     : kalil
--%>
<%@page language = "java" import = "java.util.*"%> 
<%  String nome = request.getParameter("NOME");
    if (nome == null) {
        nome = "";
    }
    Cookie meuCookie = new Cookie("nomeDoUsuario", nome);
    meuCookie.setMaxAge(50); // Determina um tempo em segundos para que o cookie expire.
    response.addCookie(meuCookie);
%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerar Cookie</title>
    </head>
    <body> 
        <p><a href="ExibirCookie.jsp">Veja valor do Cookie...</a></p> 
    </body>
</html>