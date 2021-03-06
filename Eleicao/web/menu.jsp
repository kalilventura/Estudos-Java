<%-- 
    Document   : menu
    Created on : 30/04/2019, 22:03:10
    Author     : Internet
--%>
<%@page import="br.com.votar.data.ResultadoVotacao"%>
<%@page import="br.com.votar.dao.VotarDao"%>
<%@page import="br.com.votar.data.User"%>
<%@page import="br.com.votar.data.Candidato"%>
<%@page import="br.com.votar.dao.CandidatoDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.votar.data.Eleicao"%>
<%@page import="br.com.votar.data.Eleicao"%>
<%@page import="br.com.votar.dao.EleicaoDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Inicial</title>
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
        <!--<div>
            <h1>Lista de Candidatos</h1>
        <%
            /*
             CandidatoDao candidato = new CandidatoDao();
             ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
             candidatos = candidato.BuscarEleicoes();

             if (!candidatos.isEmpty()) {
             for (Candidato ele : candidatos) {
             out.print("<p>" + ele.getCandidatoNome() + "</p>");
             }
             }
             */
        %>
    </div> !-->
        <div>
            <h2>Escolha uma eleição: </h2>
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Eleição</th>
                        <th scope="col">Descrição</th>
                        <th scope="col">Ação</th>
                    </tr>
                </thead>
                <tbody>
                    <%                        EleicaoDao eleicao = new EleicaoDao();
                        VotarDao votar = new VotarDao();

                        ArrayList<Eleicao> e = new ArrayList<Eleicao>();
                        ArrayList<ResultadoVotacao> r = new ArrayList<ResultadoVotacao>();

                        e = eleicao.BuscarEleicoes();
                        r = votar.buscarVotacao(String.valueOf(user.getIdUsuario()));

                        for (Eleicao el : e) {
                            for (ResultadoVotacao res : r) {
                                if (String.valueOf(el.getIdEleicao()).equals(res.getIdEleicao())) {
                                    el.setVotou(true);
                                }
                            }
                        }

                        if (!e.isEmpty()) {
                            for (Eleicao ele : e) {

                                String endereco = "";

                                if (!ele.getVotou()) {
                                    endereco = "<a href=\"eleicao/?idEleicao=" + ele.getIdEleicao() + "\">Votar</a> | ";
                                }

                                out.print("<tr>");
                                out.print("<td>" + ele.getIdEleicao() + "</td>");
                                out.print("<td>" + ele.getNomeEleicao() + "</td>");
                                out.print("<td>" + ele.getDescricaoEleicao() + "</td>");
                                out.print("<td>" + endereco 
                                        + "<a href=\"relatorio.jsp?id=" + ele.getIdEleicao() + "\">Relatorio</a>" + "</td>");
                                out.print("</tr>");
                            }
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
