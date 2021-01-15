

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="includes/estilos.jsp" %>
    </head>
    <body>
        <div class="container">
            <h1 class="">Logue para acessar o sistema.</h1>
            <form method="post" action="verificarLogin">
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label" for="login">Usuario:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="Digite seu login" name="login" id="login" autocomplete="off" value="traue"/>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label" for="senha">Senha:</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" placeholder="Digite sua senha" name="senha" id="senha" autocomplete="off" value="Senha123"/>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Login</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
