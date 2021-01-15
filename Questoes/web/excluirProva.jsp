<%-- 
    Document   : excluirProva
    Created on : 04/06/2019, 21:14:22
    Author     : kalil
--%>

<%@page import="br.uniniove.webquiz.DAO.ProvaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deletar</title>
    </head>
    <body>
        <h1>Excluiu!</h1>
        <%
            int idProva = Integer.parseInt(request.getParameter("idProva"));
            
            ProvaDAO pD = new ProvaDAO();
            
            pD.excluirProva(idProva);
            
            response.sendRedirect("painel.jsp");
        %>
    </body>
</html>
