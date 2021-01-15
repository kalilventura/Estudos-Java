<%-- 
    Document   : listar
    Created on : 17/04/2019, 11:43:47
    Author     : wesll
--%>

<%@page import="br.com.alunos.dao.AlunoDAO"%>
<%@page import="java.util.List"%>
<%@page import="br.com.alunos.model.Aluno" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
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
        <h3>Lista de Alunos</h3>
        ------------------------------------------------------------------------<br>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Id Aluno</th>
                    <th scope="col">Nome</th>
                    <th scope="col">RA</th>
                    <th scope="col">Id Curso</th>
                </tr>
            </thead>
            <tbody>
                <%
                    AlunoDAO aluno = new AlunoDAO();

                    List<Aluno> lista = aluno.getTodos();

                    for (Aluno x : lista) {
                        //out.println("ID Aluno: " + x.getIdAluno() + "<br>"
                           //     + "Nome: " + x.getNome() + "<br>" + "RA: " + x.getRA()
                             //   + "<br>" + "ID do Curso: " + x.getIdCurso() + "<br><br>");
                        out.print("<tr>"
                                +"<td>"+ x.getIdAluno() +"</td>"
                                +"<td>"+ x.getNome() +"</td>"
                                +"<td>"+ x.getRA() +"</td>"
                                +"<td>"+ x.getIdCurso() +"</td>"
                                + "</tr>");
                    }

                %>
            </tbody>
        </table>
        ------------------------------------------------------------------------<br>

        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
