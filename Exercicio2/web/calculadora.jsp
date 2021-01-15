<%-- 
    Document   : calculoDias
    Created on : 20/09/2018, 19:41:16
    Author     : Gerson Risso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <%
            float n1 = Float.parseFloat(request.getParameter("n1"));
            float n2 = Float.parseFloat(request.getParameter("n2"));
            char operador = request.getParameter("operador").charAt(0);;
            float resultado = 0;

            switch (operador) {
                case '+':
                    resultado = n1 + n2;
                    break;

                case '-':
                    resultado = n1 - n2;
                    break;

                case '*':
                    resultado = n1 * n2;
                    break;

                case '/':
                    if (n1 == 0 || n2 == 0) {
                        out.print("Erro");
                    } else {
                        resultado = n1 / n2;
                    }
                    break;

                default:
                    out.print("Operador errado");
                    break;

            }
            
            out.print("Resultado: " + resultado);
        %>
    </body>
</html>
