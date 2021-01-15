<%-- 
    Document   : listarCursos
    Created on : 23/04/2019, 21:02:08
    Author     : kalil
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.alunos.model.Curso"%>
<%@page import="br.com.alunos.dao.CursoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Cursos</title>
    </head>
    <body>
        <%
            CursoDAO curso = new CursoDAO();

            List<Curso> lista = curso.getTodos();

            for (Curso x : lista) {
                out.println("ID Curso: " + x.getIdCurso() + "<br>"
                        + "Nome do Curso: " + x.getNomeCurso() + "<br>"
                        + "Tipo do Curso: " + x.getTipoCurso() + "<br><br>");
            }


        %>
    </body>
</html>
