/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.100
 * Generated at: 2024-05-03 10:07:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\" />\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("  <title>Home Page</title>\r\n");
      out.write("  <style>\r\n");
      out.write("    /* Style the navigation bar */\r\n");
      out.write("    .navbar {\r\n");
      out.write("      overflow: hidden;\r\n");
      out.write("      background-color: #333;\r\n");
      out.write("      display: flex;\r\n");
      out.write("      justify-content: end;\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("     body {\r\n");
      out.write("      background-image: url('img/welcomw.jpg');\r\n");
      out.write("      background-size: cover;\r\n");
      out.write("      background-position: center;\r\n");
      out.write("      background-attachment: fixed; /* This will fix the background image */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Navigation links */\r\n");
      out.write("    .navbar a {\r\n");
      out.write("      float: right;\r\n");
      out.write("      display: block;\r\n");
      out.write("      color: #f2f2f2;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      padding: 14px 20px;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Change color on hover */\r\n");
      out.write("    .navbar a:hover {\r\n");
      out.write("      background-color: #ddd;\r\n");
      out.write("      color: black;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Active/current link */\r\n");
      out.write("    .navbar a.active {\r\n");
      out.write("      color: #ddd;\r\n");
      out.write("      background-color: #333;\r\n");
      out.write("    }\r\n");
      out.write("    .navbar a.active:hover {\r\n");
      out.write("      background-color: #ddd;\r\n");
      out.write("      color: black;\r\n");
      out.write("    }\r\n");
      out.write("    /* Login button */\r\n");
      out.write("    .login-btn {\r\n");
      out.write("      float: right;\r\n");
      out.write("      background-color: #2abdd3;\r\n");
      out.write("      border: none;\r\n");
      out.write("      color: white;\r\n");
      out.write("      padding: 14px 20px;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("      font-size: 16px;\r\n");
      out.write("      margin: 0px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* Style the login button on hover */\r\n");
      out.write("    .login-btn:hover {\r\n");
      out.write("      background-color: #2abdd3;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  \r\n");
      out.write("  <!-- Navigation bar -->\r\n");
      out.write("  <div class=\"navbar\">\r\n");
      out.write("    <a class=\"active\" href=\"#home\">Home</a>\r\n");
      out.write("    <a href=\"#about\">About</a>\r\n");
      out.write("    <a href=\"#contact\">Contact</a>\r\n");
      out.write("    <button class=\"login-btn\" onclick=\"window.location.href = 'login.jsp'\">Login</button>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Page content -->\r\n");
      out.write("  <div style=\"padding: 20px\">\r\n");
      out.write("    <br />\r\n");
      out.write("    <br />\r\n");
      out.write("    <h1>This is Homepage</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
