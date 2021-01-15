<%-- 
    Document   : login2
    Created on : 30/04/2019, 17:46:21
    Author     : p051461
--%>

<%@page import="br.com.models.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Login login = new Login();
            String nome = request.getParameter("login");
            String senha = request.getParameter("senha");
            
            login.setLogin(nome);
            login.setSenha(senha);
            
            if(login.VerificarLogin()){
                session.setAttribute("Login",nome);
                response.sendRedirect("PaginaProtegida.jsp");
            }else {
                response.sendRedirect("index.html");
            }
        %>
    </body>
</html>
