package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            input[type=text],input[type=time],input[type=date],input[type=number]\n");
      out.write("            ,input[type=drop],input[type=description]\n");
      out.write("            {\n");
      out.write("  width: 500;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  border: none;\n");
      out.write("  background-color: #3CBC8D;\n");
      out.write("  color: white;\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  }\n");
      out.write("  table, th, td {\n");
      out.write("  border: 1px solid black;\n");
      out.write("  \n");
      out.write("   \n");
      out.write("  \n");
      out.write("  }\n");
      out.write("\n");
      out.write("  \n");
      out.write("        </style>\n");
      out.write("          \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div\n");
      out.write("        <h1 ><b>Admin Control</b></h1>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <div class=\"center\" style=\"text-align:center\">\n");
      out.write("        <form action=\"adminupdate\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                           <fieldset>\n");
      out.write("        \n");
      out.write("             <legend>Add Details</legend>\n");
      out.write("          <hr>\n");
      out.write("<!--          <table style=\"align=\"center\" style=\"margin: 0 auto\">-->\n");
      out.write("<table style=\"margin-left:auto;margin-right:auto;\">\n");
      out.write("             <tr>\n");
      out.write("    <td><label for=\"id\"><b>ID</b></label></td>\n");
      out.write("    <td><input type=\"number\" name=\"number\" placeholder=\"Enter ID\" required></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <td> <label for=\"heading\"><b>Heading</b></label></td>\n");
      out.write("    <td><input type=\"text\" name=\"heading\" placeholder=\"Enter Heading\" required><br/></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <td><label for=Author\"><b>Author</b></label></td>\n");
      out.write("    <td> <input type=\"text\" name=\"author\" placeholder=\"Enter Author Name\" required>  \n");
      out.write("    \n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <td> <label for=\"Description\"><b>Description</b></label></td>\n");
      out.write("    <td><input type=\"text\" name=\"description\" placeholder=\"Add Description\" required></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("      <td><label for=\"uploadimage\"><b>Upload Image</b></label></td>\n");
      out.write("      <td><input type=\"file\" name=\"file\" id=\"file\" ></td>\n");
      out.write("  \n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  \n");
      out.write(" \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("      <td><label for=\"category\"><b>Select Category</b></label></td>\n");
      out.write("      <td><select name=\"drop1\" >\n");
      out.write("                  <option value=\"Select\">Select Category</option>\n");
      out.write("                <option value=\"Economy\">Economy</option>\n");
      out.write("                <option value=\"Sport\">Sport</option>\n");
      out.write("                <option value=\"Entertainment\">Entertainment</option>\n");
      out.write("                <option value=\"Politics\">Politics</option>\n");
      out.write("                <option value=\"Economy\">Economy</option>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  </select></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <td><label>Select CAtegory to approval: </label></td>\n");
      out.write("      <td><select name=\"drop3\">\n");
      out.write("              <option value=\"true\">True</option>\n");
      out.write("              <option value=\"false\">FALSE</option>\n");
      out.write("          </select>\n");
      out.write("      </td>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("   <tr>\n");
      out.write("      <td><label>Set Images as slider: </label></td>\n");
      out.write("      <td><select name=\"drop2\">\n");
      out.write("              <option value=\"yes\">YES</option>\n");
      out.write("              <option value=\"no\">NO</option>\n");
      out.write("          </select>\n");
      out.write("      </td>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("  </tr>\n");
      out.write(" \n");
      out.write("  <tr>\n");
      out.write("  \n");
      out.write("  <button type=\"submit\">Submit</button>\n");
      out.write(" \n");
      out.write("      </tr>\n");
      out.write("  \n");
      out.write("\n");
      out.write("        \n");
      out.write("         </table>\n");
      out.write("      </form>\n");
      out.write("             <hr>\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
