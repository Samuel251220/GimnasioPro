package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgregarProdAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/view/../WEB-INF/template/HeadViewLinks.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/BarraTipos.jspf");
    _jspx_dependants.add("/view/../WEB-INF/template/FooterViewLinks.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AGREGAR PRODUCTOS</title>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/angular.min.js\"></script>");
      out.write("\n");
      out.write("        <link  href=\"../css/BarraTipos.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/AgregarProdAdmin.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body ng-app=\"app\" ng-controller=\"appController\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("        <!-- Sidebar Holder -->\n");
      out.write("        <nav id=\"sidebar\">\n");
      out.write("            <div class=\"sidebar-header\">\n");
      out.write("                <h3>Stronger GYM <i class=\"pesa fas fa-dumbbell\"></i></h3>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"list-unstyled components\">\n");
      out.write("                <h4 class=\"bienvenido\">Bienvenido </h4><br>\n");
      out.write("                <li class=\"bar\"><a href=\"menur?opc=1\">Multimedia</a></li><br>\n");
      out.write("                <li class=\"bar\"><a href=\"menur?opc=2\">Productos</a></li><br>\n");
      out.write("                <li class=\"bar\"><a href=\"menur?opc=3\">Mis Pedidos</a></li><br>\n");
      out.write("                <li class=\"bar\"><a href=\"menur?opc=4\">Mis Compras</a></li><br>\n");
      out.write("                <li class=\"bar\"><a href=\"menur?opc=9\">Servicios</a></li><br>\n");
      out.write("                <li class=\"bar cont-flecha\"><a href=\"menur?opc=10\"><i class=\"fas fa-door-open flecha\"></i></a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Page Content Holder -->\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <nav class=\"navbar navbar-default tabla  \">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" id=\"sidebarCollapse\" class=\"navbar-btn\">\n");
      out.write("                            <span></span>\n");
      out.write("                            <span></span>\n");
      out.write("                            <span></span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <!--<li><a href=\"#\">Page</a></li>\n");
      out.write("                            <li><a href=\"#\">Page</a></li>\n");
      out.write("                            <li><a href=\"#\">Page</a></li>\n");
      out.write("                            <li><a href=\"#\">Page</a></li>-->\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("        <div class=\"conteiner\">\n");
      out.write("            <div class=\"reserva\">\n");
      out.write("                <div class=\"busqueda\">\n");
      out.write("                    <h2 style=\"margin: 0;\">Agregar Productos</h2>\n");
      out.write("                    <div class=\"input-group stylish-input-group cont navbar-right\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Busca por codigo\" class=\"form-control\">\n");
      out.write("                        <span class=\"input-group-addon\">\n");
      out.write("                            <button type=\"submit\">\n");
      out.write("                                <i class=\"fas fa-search\"></i>\n");
      out.write("                            </button>  \n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <button class=\"btn btn-info\"  style=\"width: 100px;\" ng-click=\"add()\"><i class=\"fas fa-plus mas\"></i></button>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"table-responsive tabla\" style=\"margin: 5% 0;\">\n");
      out.write("                    <table class=\"table \">\n");
      out.write("                        <thead style=\"background: #343a40;color: #fff;\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">#</th>\n");
      out.write("                                <th scope=\"col\">ID</th>\n");
      out.write("                                <th scope=\"col\">NOMBRE</th>\n");
      out.write("                                <th scope=\"col\">PRECIO</th>\n");
      out.write("                                <th scope=\"col\">CODIGO</th>\n");
      out.write("                                <th scope=\"col\">ESTADO</th>\n");
      out.write("                                <th scope=\"col\">STOCK</th>\n");
      out.write("                                <th scope=\"col\" colspan=\"2\">ACCION</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody ng-repeat=\"x in personas\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>{{$index + 1}}</td>\n");
      out.write("                                <td>{{x.idprod}}</td>\n");
      out.write("                                <td>{{x.nomprod}}</td>\n");
      out.write("                                <td>{{x.precprod}}</td>\n");
      out.write("                                <td>{{x.cod}}</td>\n");
      out.write("                                <td>{{x.estado}}</td>\n");
      out.write("                                <td>{{x.stock}}</td>\n");
      out.write("                                <td ng-click=\"editar\"><i class=\"far fa-edit\"></i></td>\n");
      out.write("                                <td ng-click=\"eliminar\"><i class=\"far fa-trash-alt\"></i></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Modal PARA REGISTRAR-->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\" id=\"exampleModalLabel\">REGISTRAR PRODUCTO</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">×</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Nombre :</label>\n");
      out.write("                            <input type=\"text\" id=\"nompro\" class=\"form-control\">\n");
      out.write("                            <br>\n");
      out.write("                            <label>Precio :</label>\n");
      out.write("                            <input type=\"text\" id=\"precio\" class=\"form-control\">\n");
      out.write("                            <br>\n");
      out.write("                            <label>Codigo :</label>\n");
      out.write("                            <input type=\"text\" id=\"codigo\" class=\"form-control\">\n");
      out.write("                            <br>\n");
      out.write("                            <label>Estado :</label>\n");
      out.write("                            <input type=\"text\" id=\"estado\" class=\"form-control\">\n");
      out.write("                            <br>\n");
      out.write("                            <label>Stock :</label>\n");
      out.write("                            <input type=\"text\" id=\"stock\" class=\"form-control\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" id=\"savepro\" ng-click=\"guardar()\">Guardar Producto</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--MODAL PARA EDITAR-->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title\" id=\"exampleModalLabel\">Editar Producto</h4>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">×</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"hidden\" id=\"edit_idPro\" class=\"form-control\">\n");
      out.write("                            \n");
      out.write("                            <label>Nombre :</label>\n");
      out.write("                            <input type=\"text\" id=\"edit_nompro\" class=\"form-control\">\n");
      out.write("                            <br>\n");
      out.write("                            <label>Precio :</label>\n");
      out.write("                            <input type=\"text\" id=\"edit_precio\" class=\"form-control\">\n");
      out.write("                            <br>\n");
      out.write("                            <label>Codigo :</label>\n");
      out.write("                            <input type=\"text\" id=\"edit_codigo\" class=\"form-control\">\n");
      out.write("                            <br>\n");
      out.write("                            <label>Estado :</label>\n");
      out.write("                            <input type=\"text\" id=\"edit_estado\" class=\"form-control\">\n");
      out.write("                            <br>\n");
      out.write("                            <label>Stock :</label>\n");
      out.write("                            <input type=\"text\" id=\"edit_stock\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\" id=\"editpro\" ng-click=\"update()\">Modifiar Producto</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--De la barraTipos-->\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("        <!--Fin de código aqui-->\n");
      out.write("        \n");
      out.write("        ");
      out.write("\r\n");
      out.write("<script src=\"../js/fontawesome-all.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("        <script src=\"../js/AgregarProdAdmin.js\"></script>\n");
      out.write("        <script src=\"../js/BarraTipos.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
