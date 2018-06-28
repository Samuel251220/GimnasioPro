<%-- 
    Document   : AgregarProdAdmin
    Created on : 26/06/2018, 10:43:02 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AGREGAR PRODUCTOS</title>
        <%@include file="../WEB-INF/template/HeadViewLinks.jspf" %>
        <link  href="../css/BarraTipos.css" rel="stylesheet"/>
        <link rel="stylesheet" href="../css/AgregarProdAdmin.css"/>
    </head>
    <body ng-app="app" ng-controller="appController">
        <%@include file="../WEB-INF/template/BarraTipos.jspf" %>
        <div class="conteiner">
            <div class="reserva">
                <div class="busqueda">
                    <h2 style="margin: 0;">Agregar Productos</h2>
                    <div class="input-group stylish-input-group cont navbar-right">
                        <input type="text" placeholder="Busca por codigo" class="form-control">
                        <span class="input-group-addon">
                            <button type="submit">
                                <i class="fas fa-search"></i>
                            </button>  
                        </span>
                    </div>
                </div>
                <br>
                <button class="btn btn-info"  style="width: 100px;" ng-click="add()"><i class="fas fa-plus mas"></i></button>
                <br>
                <div class="table-responsive tabla" style="margin: 5% 0;">
                    <table class="table ">
                        <thead style="background: #343a40;color: #fff;">
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">ID</th>
                                <th scope="col">NOMBRE</th>
                                <th scope="col">PRECIO</th>
                                <th scope="col">CODIGO</th>
                                <th scope="col">ESTADO</th>
                                <th scope="col">STOCK</th>
                                <th scope="col" colspan="2">ACCION</th>
                            </tr>
                        </thead>
                        <tbody ng-repeat="x in personas">
                            <tr>
                                <td>{{$index + 1}}</td>
                                <td>{{x.idprod}}</td>
                                <td>{{x.nomprod}}</td>
                                <td>{{x.precprod}}</td>
                                <td>{{x.cod}}</td>
                                <td>{{x.estado}}</td>
                                <td>{{x.stock}}</td>
                                <td ng-click="editar"><i class="far fa-edit"></i></td>
                                <td ng-click="eliminar"><i class="far fa-trash-alt"></i></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <!-- Modal PARA REGISTRAR-->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="exampleModalLabel">REGISTRAR PRODUCTO</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <label>Nombre :</label>
                            <input type="text" id="nompro" class="form-control">
                            <br>
                            <label>Precio :</label>
                            <input type="text" id="precio" class="form-control">
                            <br>
                            <label>Codigo :</label>
                            <input type="text" id="codigo" class="form-control">
                            <br>
                            <label>Estado :</label>
                            <input type="text" id="estado" class="form-control">
                            <br>
                            <label>Stock :</label>
                            <input type="text" id="stock" class="form-control">
                            
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                        <button type="button" class="btn btn-primary" id="savepro" ng-click="guardar()">Guardar Producto</button>
                    </div>
                </div>
            </div>
        </div>
        <!--MODAL PARA EDITAR-->
        <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-sm" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="exampleModalLabel">Editar Producto</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <input type="hidden" id="edit_idPro" class="form-control">
                            
                            <label>Nombre :</label>
                            <input type="text" id="edit_nompro" class="form-control">
                            <br>
                            <label>Precio :</label>
                            <input type="text" id="edit_precio" class="form-control">
                            <br>
                            <label>Codigo :</label>
                            <input type="text" id="edit_codigo" class="form-control">
                            <br>
                            <label>Estado :</label>
                            <input type="text" id="edit_estado" class="form-control">
                            <br>
                            <label>Stock :</label>
                            <input type="text" id="edit_stock" class="form-control">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                        <button type="button" class="btn btn-primary" id="editpro" ng-click="update()">Modifiar Producto</button>
                    </div>
                </div>
            </div>
        </div>
        <!--De la barraTipos-->
    </div>
    </div>
        <!--Fin de código aqui-->
        
        <%@include file="../WEB-INF/template/FooterViewLinks.jspf" %>
        <script src="../js/AgregarProdAdmin.js"></script>
        <script src="../js/BarraTipos.js" type="text/javascript"></script>
    </body>
</html>
