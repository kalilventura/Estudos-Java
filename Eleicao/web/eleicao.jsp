<%-- 
    Document   : votar
    Created on : 30/04/2019, 19:52:22
    Author     : Internet
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.votar.data.Candidato"%>
<%@page import="br.com.votar.data.Eleicao"%>
<%@page import="br.com.votar.dao.CandidatoDao"%>
<%@page import="br.com.votar.data.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votar</title>
        <%@include file="includes/estilos.jsp" %>
    </head>
    <body>
        <%

            User user = (User) session.getAttribute("currentSessionUser");
            if (user == null) {
                response.getWriter().print("<script> alert('Usuário não encontrado !!'); " + "location.href='login.jsp' </script>");
            }


        %>
        <%@include file="includes/menu.jsp" %>
        <h2>Votar: </h2>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Ação</th>
                </tr>
            </thead>

            <%                
                HttpServletRequest req = (HttpServletRequest) request;
                String idEleicao = req.getParameter("idEleicao");
                CandidatoDao candidatoDao = new CandidatoDao();
                ArrayList<Candidato> e = new ArrayList<Candidato>();

                e = candidatoDao.buscaCandidatorPorEleicao(idEleicao);

                if (!e.isEmpty()) {
                    for (Candidato can : e) {
                        out.print("<tr>");
                        out.print("<td>" + can.getCandidatoId() + "</td>");
                        out.print("<td>" + can.getCandidatoNome() + "</td>");
                        //out.print("<td>" + "<a href=\"../votar/?idCandidato="+ can.getCandidatoId() + "\">Votar</a>");
                        out.print("<td><form action=\"votar\" method=\"post\">"
                                + "<input type=\"hidden\" name=\"idCandidato\" value=\"" + can.getCandidatoId() + "\">"
                                + "<input type=\"hidden\" name=\"idEleicao\" value=\"" + idEleicao + "\">"
                                + "<button type=\"submit\" class=\"btn btn-primary\">Votar</button>"
                                + "</form>"
                                + "</td>");
                        out.print("</tr>");
                    }
                }
            %>
    </body>
</html>
