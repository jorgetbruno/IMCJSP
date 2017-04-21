/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-21 02:33:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Calculo IMC JSP</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("        <div class=\"modal-dialog\" style=\"margin-bottom:0\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h1 class=\"panel-title\">Calculo IMC</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form name=\"formulario\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"sel1\">Height:</label>\n");
      out.write("                                <div class=\"input-group input-group-lg\">\n");
      out.write("\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"sizing-addon1\">Meters</span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Height\" aria-describedby=\"sizing-addon1\" name=\"height\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"sel1\">Weight:</label>\n");
      out.write("                                <div class=\"input-group input-group-lg\">\n");
      out.write("\n");
      out.write("                                    <span class=\"input-group-addon\" id=\"sizing-addon1\">Kilograms</span>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Weight\" aria-describedby=\"sizing-addon1\" name=\"weight\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"sex\">Select Sex:</label>\n");
      out.write("                            <select class=\"form-control\" id=\"sex\" name=\"sex\">\n");
      out.write("                              <option>Male</option>\n");
      out.write("                              <option>Female</option>\n");
      out.write("                            </select>\n");
      out.write("                            </div>\n");
      out.write("                            <button class=\"btn btn-sm btn-success\">Calcular</button>\n");
      out.write("                        </fieldset>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Scriptlet. CÃ³digo Java na pÃ¡gina JSP. -->\n");
      out.write("        ");

        String heightStr = request.getParameter("height");
        String weightStr = request.getParameter("weight");
        String sexStr = request.getParameter("sex");
        String mensagem = "";
        String tipoMensagem = "";

        if( ! heightStr.isEmpty() && !weightStr.isEmpty() && ! sexStr.isEmpty()){

          float weight = Float.parseFloat(weightStr);
          float height = Float.parseFloat(heightStr);

          float imc = weight / (height * height);

          System.out.print(sexStr);
          if(sexStr.equals("Male")){
            if (imc < 20) {
              mensagem = "Abaixo do peso!";
              tipoMensagem = "warning";
            } else if (imc < 26.4) {
              mensagem = "Peso ideal, good job son";
              tipoMensagem = "success";
            } else {
              mensagem = "Acima do peso!";
              tipoMensagem = "warning";
            }
          }else{
            if (imc < 19.1) {
              mensagem = "Abaixo do peso!";
              tipoMensagem = "warning";
            } else if (imc < 25.8) {
              mensagem = "Peso ideal, nice";
              tipoMensagem = "success";
            } else {
              mensagem = "Acima do peso!";
              tipoMensagem = "warning";
            }
          }
        }

        
      out.write("\n");
      out.write("        <!-- UtilizaÃ§Ã£o de vaviÃ¡veis em expressÃµes JSP. -->\n");
      out.write("        <div class=\"alert alert-");
      out.print(tipoMensagem);
      out.write("\" role=\"alert\" style=\"margin-top:45px\">");
      out.print(mensagem);
      out.write("</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}