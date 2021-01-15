<%-- 
    Document   : cadastrarProva
    Created on : 04/06/2019, 19:47:52
    Author     : kalil
--%>

<%@page import="br.uniniove.webquiz.DAO.QuestaoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.uninove.webquiz.model.Questao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Prova</title>
    </head>
    <body>
        <div>
            <form method="post" action="SalvarProva">
                <div>
                    <label>Nome da Prova</label>
                    <input type="text" name="nomeProva" placeholder="Digite o nome da prova" />
                </div>
                <div>
                    <%
                        QuestaoDAO qDao = new QuestaoDAO();
                        ArrayList<Questao> questoes = qDao.getTodasQuestoes();

                        out.print("<table>");
                        out.print("<tr>");
                        out.print("<th>Id Questão </th>");
                        out.print("<th>Questão </th>");
                        out.print("<th>Selecionar Questão</th>");
                        out.print("</tr>");
                        for (Questao q : questoes) {
                            out.print("<tr>");
                            out.print("<td>" + q.getIdQuestao() + "</td>");
                            out.print("<td>" + q.getQuestao() + "</td>");
                            out.print("<td> <input type=\"checkbox\" name=\"questoes\" value=" + q.getIdQuestao() + "> </td>");
                            out.print("</tr>");
                        }
                        out.print("</table>");
                    %>
                </div>
                <div>
                    <input type="submit" value="Enviar"/>
                </div>
            </form>
        </div>
    </body>
</html>
