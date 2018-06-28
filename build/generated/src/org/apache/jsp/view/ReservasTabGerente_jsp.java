package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ReservasTabGerente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/view/../WEB-INF/template/HeadViewLinks.jspf");
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
      out.write("        <title>RESERVAS GERENTE</title>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script src=\"../js/angular.min.js\"></script>");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/ReservasTabGerente.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body ng-app=\"app\" ng-controller=\"appController\">\n");
      out.write("        <div class=\"conteiner\">\n");
      out.write("            <div class=\"reserva\">\n");
      out.write("                <div class=\"busqueda\">\n");
      out.write("                    <h2 style=\"margin: 0;\">Reservas</h2>\n");
      out.write("                    <div class=\"input-group stylish-input-group cont navbar-right\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Busca por codigo\" class=\"form-control\">\n");
      out.write("                        <span class=\"input-group-addon\">\n");
      out.write("                            <button type=\"submit\">\n");
      out.write("                                <i class=\"fas fa-search\"></i>\n");
      out.write("                            </button>  \n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tabla\" style=\"margin: 5% 0;\">\n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead style=\"background: #343a40;color: #fff;\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">#</th>\n");
      out.write("                                <th scope=\"col\">ID-PEDIDO</th>\n");
      out.write("                                <th scope=\"col\">FECHA</th>\n");
      out.write("                                <th scope=\"col\">USUARIO</th>\n");
      out.write("                                <th scope=\"col\">PRODUCTO</th>\n");
      out.write("                                <th scope=\"col\">CANTIDAD</th>\n");
      out.write("                                <th scope=\"col\">CODIGO-PED</th>\n");
      out.write("                                <th scope=\"col\">ESTADO</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody ng-repeat=\"x in personas\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>{{$index + 1}}</td>\n");
      out.write("                                <td>{{x.idpedido}}</td>\n");
      out.write("                                <td>{{x.fecha}}</td>\n");
      out.write("                                <td>{{x.usunom}}</td>\n");
      out.write("                                <td>{{x.prodnom}}</td>\n");
      out.write("                                <td>{{x.cantidad}}</td>\n");
      out.write("                                <td>{{x.codped}}</td>\n");
      out.write("                                <td>{{x.estado}}</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var app = angular.module(\"app\", []);\n");
      out.write("            app.controller(\"appController\", function($scope) {\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<script src=\"../js/fontawesome-all.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>");
      out.write("\n");
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
