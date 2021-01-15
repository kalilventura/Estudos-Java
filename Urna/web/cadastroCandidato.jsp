<%@page import="java.util.ArrayList"%>
<%@page import="br.com.votar.data.Eleicao"%>
<%@page import="br.com.votar.dao.EleicaoDao"%>
<%-- 
    Document   : cadastroCandidato
    Created on : 30/04/2019, 19:56:52
    Author     : Internet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Candidato</title>
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
        <div class="container">
            <h2>Cadastre o Candidato</h2>
            <form method="post" action="CadastroCandidato">
                <div class="form-group">
                    <label for="nomeCandidato">Candidato: </label>
                    <input type="text" placeholder="Nome do Candidato" name="nomeCandidato" id="nomeCandidato" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="eleicao">Escolha a eleição: </label>
                    <select name="eleicao" id="eleicao" class="form-control">
                        <%
                            EleicaoDao eleicao = new EleicaoDao();
                            ArrayList<Eleicao> e = new ArrayList<Eleicao>();

                            e = eleicao.BuscarEleicoes();

                            if (!e.isEmpty()) {
                                for (Eleicao ele : e) {
                                    out.print("<option value=\"" + ele.getIdEleicao() + "\">" + ele.getNomeEleicao() + "</option>");
                                }
                            }
                        %>
                    </select>
                </div>
                    <button class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>