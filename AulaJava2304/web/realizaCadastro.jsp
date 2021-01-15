<%-- 
    Document   : realizaCadastro
    Created on : 17/04/2019, 13:04:39
    Author     : wesll
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="br.com.alunos.model.Curso"%>
<%@page import="br.com.alunos.dao.CursoDAO"%>
<%@page import="br.com.alunos.model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Cadastrar Aluno</title>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
                <a class="navbar-brand" href="index.html">Inicio</a>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="listar.jsp">Listar</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="realizaCadastro.jsp">Cadastrar Aluno</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="cadastrarCurso.jsp">Cadastrar Curso</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <br>
        <br>
        <br>
        <div class="container">
            <form method="post" action="IncluirAluno">
                <div class="form-group">
                    <label for="ra">RA: </label>
                    <input id="ra" type="text" name="RA" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <input id="nome" type="text" name="nome" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Curso: </label>
                    <select class="form-control col-md-5" name="idCurso">
                        <%
                            CursoDAO cursos = new CursoDAO();
                            ArrayList<Curso> c = new ArrayList<Curso>();
                            c = cursos.getTodos();

                            for (Curso cur : c) {
                                out.print("<option value=\"" + cur.getIdCurso() + "\">" + cur.getNomeCurso() + "</option>");
                            }
                        %>
                    </select>
                    <a href="cadastrarCurso.jsp">Novo curso</a>
                </div>
                <button type="submit" class="btn btn-primary">Cadastrar</button>
            </form>
        </div>
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
