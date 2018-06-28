angular.module('app',[])
.controller('appController',['$scope','$http',function($scope ,$http){
    $(document).ready(function (){
        listarProd();
    });
    $scope.add=function(){
        $("#myModal").modal('show');
        $("#nompro").val("");
        $("#precio").val("");
        $("#codigo").val("");
        $("#estado").val("");  
        $("#stock").val("");
    };
    function listarProd(){
        /*$http({
            method:'POST',
            url: 'hc',
            data: 'opc=6',
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        })
        .then(function(data) {
            str = JSON.stringify(data);
            xa=JSON.parse(str);
            $scope.produc=xa.data;
        });*/
    };
    $scope.guardar=function(){
        var nom = $("#nompro").val();
        var pre = $("#precio").val();
        var cod = $("#codigo").val();
        var est = $("#estado").val();  
        var stk = $("#stock").val();
        $("#myModal").modal('hide');
        /*$http({
            method:'POST',
            url: 'hc',
            data: 'nomprod='+nom+'&precio='+pre+'&stock='+sto+'&cod='+cod+'&opc=8',
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        });*/
        listarProd();
    };
    $scope.eliminar=function (x){
        /*$http({
            method:'POST',
            url: 'hc',
            data: 'idprod='+x+'&opc=10',
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        })
        .then(function() {
            listarProd();
        });*/
    };
    $scope.editar=function(x){
        /*$http({     
            method:'POST',
            url: 'hc',
            data: 'idprod='+x+'&opc=7',
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        })
        .then(function(data) {
            str = JSON.stringify(data);
            console.log(str);
            x=JSON.parse(str).data;

            $("#myModal2").modal('show');
            $("#edit_idPro").val(x.idprod);
            $("#edit_nompro").val(x.nomprod);
            $("#edit_preciopro").val(x.precio);
            $("#edit_stockpro").val(x.stock);
            $("#edit_codigopro").val(x.cod);
        });*/
        $("#myModal2").modal('show');
        $("#edit_idPro").val(x.idprod);
        $("#edit_nompro").val(x.nomprod);
        $("#edit_precio").val(x.precprod);
        $("#edit_codigo").val(x.cod);
        $("#edit_estado").val(x.estado);  
        $("#edit_stock").val(x.stock);
        
    };
    
        $scope.update=function (){
        var idp = $("#edit_idPro").val();
        var nomp = $("#edit_nompro").val();
        var pre = $("#edit_precio").val();
        var cod = $("#edit_codigo").val();
        var est = $("#edit_estado").val();  
        var stk = $("#edit_stock").val();
        /*$http({
            method:'POST',
            url: 'hc',
            data: 'idprod='+idp+'&nomprod='+nom+'&precio='+prec+'&stock='+stk+'&cod='+cod+'&opc=9',
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        }).then(function () {
            listarProd();
        });*/
    };
    
    
    
    
}]);

