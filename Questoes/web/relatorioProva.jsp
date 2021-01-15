<%-- 
    Document   : relatorioProva
    Created on : 28/05/2019, 21:44:21
    Author     : kalil
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="br.uniniove.webquiz.DAO.QuestaoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nota da prova</h1>
        <%
            int idProva = Integer.parseInt(request.getParameter("idProva"));
            QuestaoDAO qDAO = new QuestaoDAO();
            Map<Integer, Double> a = qDAO.PegarResultadoProva(idProva);

            //out.print(a.toString());

            //for (int i = 0; i < a.size(); i++) {
            //  out.print("<p>Nota da prova: " + a.get(i) + "</p>");
            //}
            for (Integer valor : a.keySet()) {
                out.print("<p> Prova: "+valor + " / Nota da Prova: " + a.get(valor)+"</p>");
            }


        %>
    </body>
</html>
