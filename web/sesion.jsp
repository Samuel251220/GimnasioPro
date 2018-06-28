<%-- 
    Document   : sesion
    Created on : 25/06/2018, 05:42:28 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="WEB-INF/template/HeadInicioLinks.jspf" %>
        <link rel="stylesheet" href="css/secion.css"/>
    </head>
    <body style="background: linear-gradient(to right,#2b4b52,#00d1ff);">
        <div class="contentAll">
            <div class="imgL" style="background-image: url(img/login.jpg);">Iniciar sesion</div>
            <div class="formuDiv">
                <form method="post" action="Login" class="formu">
                    <div class="divI">
                        <label>Ususario:</label>
                        <input type="text" placeholder="Enter username" class="txt" id="nick"><br><br>
                        <label>Contraseña: </label>
                        <input type="password" placeholder="Enter password" class="txt" id="pass">
                    </div>
                    <br><br>
                    <div class="divO">
                        <div class="divCheck">
                            <input type="checkbox"><span class="checkS">Recuerdame</span>
                        </div>
                        <div class="divF">
                            <span>Olvidaste tu contraseña?</span>
                        </div>
                    </div>
                    <br><br>
                    <div class="divB">
                        <input type="button" value="Iniciar Sesion" class="btnL" id="validar">
                    </div>
                </form>
            </div>
        </div>
        
        <%@include file="WEB-INF/template/FooterInicioLinks.jspf" %> 
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
