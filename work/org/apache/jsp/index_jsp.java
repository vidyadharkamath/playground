package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Test Application</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\"     type=\"text/css\"> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h2>index jsp</h2>\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<th>Firstname</th>\n");
      out.write("<th>Lastname</th>\n");
      out.write("<th>Savings</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Peter</td>\n");
      out.write("<td>Griffin</td>\n");
      out.write("<td>$100</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Lois</td>\n");
      out.write("<td>Griffin</td>\n");
      out.write("<td>$150</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Joe</td>\n");
      out.write("<td>Swanson</td>\n");
      out.write("<td>$300</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Cleveland</td>\n");
      out.write("<td>Brown</td>\n");
      out.write("<td>$250</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
