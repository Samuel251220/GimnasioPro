<%-- 
    Document   : ReservasTabAdmin
    Created on : 26/06/2018, 10:42:30 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RESERVAS ADMINISTRADOR</title>
        <%@include file="../WEB-INF/template/HeadViewLinks.jspf" %>
        <link rel="stylesheet" href="../css/ReservasTabAdmin.css"/>
    </head>
    <body ng-app="app" ng-controller="appController">
        <div class="conteiner">
            <div class="reserva">
                <div class="busqueda">
                    <h2 style="margin: 0;">Reservas Administrador</h2>
                    <div class="input-group stylish-input-group cont navbar-right">
                        <input type="text" placeholder="Busca por codigo" class="form-control">
                        <span class="input-group-addon">
                            <button type="submit">
                                <i class="fas fa-search"></i>
                            </button>  
                        </span>
                    </div>
                </div>
                <div class="table-responsive tabla" style="margin: 5% 0;">
                    <table class="table">
                        <thead style="background: #343a40;color: #fff;">
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">CODIGO-PED</th>
                                <th scope="col">FECHA</th>
                                <th scope="col">USUARIO</th>
                                <th scope="col">PRODUCTO</th>
                                <th scope="col">CANTIDAD</th>
                                <th scope="col">ESTADO</th>
                                <th scope="col">CONFIRMAR</th>
                            </tr>
                        </thead>
                        <tbody ng-repeat="x in personas">
                            <tr>
                                <td>{{$index + 1}}</td>
                                <td>{{x.codped}}</td>
                                <td>{{x.fecha}}</td>
                                <td>{{x.usunom}}</td>
                                <td>{{x.prodnom}}</td>
                                <td>{{x.cantidad}}</td>
                                <td>{{x.estado}}</td>
                                <td ng-click="confirmar"><i class="far fa-check-circle confirmar"></i></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <script>
            var app = angular.module("app", []);
            app.controller("appController", function($scope) {
                
            });
        </script>
        <%@include file="../WEB-INF/template/FooterViewLinks.jspf" %>
    </body>
</html>
