<%@page import="br.com.votar.data.User"%>
<%-- 
    Document   : cadastroEleicao
    Created on : 30/04/2019, 19:56:52
    Author     : Internet
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Eleição</title>
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
            <h2>Cadastre a eleição: </h2>
            <form method="post" action="CadastroEleicao">
                <div class="form-group">
                    <label for="eleicao">Eleição: </label>
                    <input type="text" placeholder="Nome da eleição" name="eleicao" id="eleicao" class="form-control" required/>
                </div>
                <div class="form-group">
                    <label for="descricao">Descrição: </label>
                    <input type="text" placeholder="Descrição da eleição" name="descricao" id="descricao" class="form-control" required/>
                </div>
                <button class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
    </body>
</html>