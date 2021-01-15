<%-- 
    Document   : relatorio.jsp
    Created on : 30/04/2019, 19:50:47
    Author     : Internet
--%>
<%@page import="br.com.votar.data.Candidato"%>
<%@page import="br.com.votar.data.Candidato"%>
<%@page import="br.com.votar.dao.CandidatoDao"%>
<%@page import="br.com.votar.data.Relatorio"%>
<%@page import="br.com.votar.dao.RelatorioDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.votar.dao.EleicaoDao"%>
<%@page import="br.com.votar.data.Eleicao"%>
<%@page import="br.com.votar.data.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Relatório das votações</title>
        <%@include file="includes/estilos.jsp" %>
    </head>
    <body>
        <%
            User user = (User) session.getAttribute("currentSessionUser");
            if (user == null) {
                response.getWriter().print("<script> alert('Usuário não encontrado !!'); " + "location.href='index.jsp' </script>");
            }
        %>
        <%@include file="includes/menu.jsp" %>
        <h2>Relatório da Eleição: </h2>
        <br>
        <div>
            <div>
                <div>
                    <table class="table mdl-data-table mdl-js-data-table">
                        <thead>
                            <tr>
                                <th scope="col">Candidatos</th>
                                <th scope="col">Votos</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                String idEleicao = request.getParameter("id");
                                RelatorioDao relatorio = new RelatorioDao();
                                CandidatoDao candidatoDao = new CandidatoDao();
                                ArrayList<Candidato> e = new ArrayList<Candidato>();

                                e = candidatoDao.buscaCandidatorPorEleicao(idEleicao);
                                
                                if (!e.isEmpty()) {
                                    for (Candidato can : e) {
                                        int quantidadeVotos = relatorio.buscarResultadoVotosCandidato(Integer.parseInt(idEleicao), can.getCandidatoId());
                                        out.print("<tr>");
                                        out.print("<td>" + can.getCandidatoNome() + "</td>");
                                        out.print("<td>" + quantidadeVotos + "</td>");
                                        out.print("</tr>");
                                    }
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
