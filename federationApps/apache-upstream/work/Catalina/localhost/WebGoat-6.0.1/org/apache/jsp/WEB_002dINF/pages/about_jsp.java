package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!-- This modal content is included into the main_new.jsp -->\n");
      out.write("\n");
      out.write("<div class=\"modal-content\">\n");
      out.write("    <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("        <h3 class=\"modal-title\" id=\"myModalLabel\">About WebGoat - Provided by the OWASP Foundation</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-body modal-scroll\">\n");
      out.write("        <p>Thanks for hacking The Goat!</p> \n");
      out.write("        <p>WebGoat is a demonstration of common web application flaws. The\n");
      out.write("            associated exercises are intended to provide hands-on experience with\n");
      out.write("            techniques aimed at demonstrating and testing application penetration.\n");
      out.write("        </p>\n");
      out.write("        <p>From the entire WebGoat team, we appreciate your interest and efforts\n");
      out.write("            in making applications not just better, but safer and more secure for\n");
      out.write("            everyone. We, as well as our sacrificial goat, thank you.</p>\n");
      out.write("        <p>\n");
      out.write("            Version: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(",&nbsp;Build: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${build}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <p>Contact us:\n");
      out.write("                <ul>\n");
      out.write("                    <li>WebGoat mailing list: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emailList}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</li>\n");
      out.write("                    <li>Bruce Mayhew:  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contactEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</li>\n");
      out.write("                </ul>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>       \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <p>WebGoat Authors\n");
      out.write("                <ul>\n");
      out.write("                    <li>Bruce Mayhew (Project Lead)</li>\n");
      out.write("                    <li>Jeff Williams (Original Idea)</li>\n");
      out.write("                    <li>Richard Lawson (Architect)</li>\n");
      out.write("                    <li>Jason White (Architect)</li>\n");
      out.write("                </ul>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <p>WebGoat Design Team\n");
      out.write("                <ul>\n");
      out.write("                    <li>Richard Lawson</li>\n");
      out.write("                    <li>Bruce Mayhew</li>\n");
      out.write("                    <li>Jason White</li>\n");
      out.write("                    <li>Ali Looney (User Interface)</li>\n");
      out.write("                    <li>Jeff Wayman (Website and Docs)</li>\n");
      out.write("                </ul>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <p>Active Contributors\n");
      out.write("                <ul>\n");
      out.write("                    <li>Nanne Baars (Developer)</li>\n");
      out.write("                    <li>Dave Cowden (Everything)</li>\n");
      out.write("                    <li>Keith Gasser (Survey/Security)</li>\n");
      out.write("                    <li>Devin Mayhew (Setup/Admin)</li>\n");
      out.write("                    <li>Li Simon (Developer)</li>\n");
      out.write("                </ul>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <p>Past Contributors\n");
      out.write("                <ul>\n");
      out.write("                    <li>David Anderson (Developer/Design)</li>\n");
      out.write("                    <li>Christopher Blum (Lessons)</li>\n");
      out.write("                    <li>Laurence Casey (Graphics)</li>\n");
      out.write("                    <li>Brian Ciomei (Bug fixes)</li>\n");
      out.write("                    <li>Rogan Dawes (Lessons)</li>\n");
      out.write("                    <li>Erwin Geirnaert (Solutions)</li>\n");
      out.write("                    <li>Aung Knant (Documentation)</li>\n");
      out.write("                    <li>Ryan Knell (Lessons)</li>\n");
      out.write("                    <li>Christine Koppeit (Build)</li>\n");
      out.write("                    <li>Sherif Kousa (Lessons/Documentation)</li>\n");
      out.write("                    <li>Reto Lippuner (Lessons)</li>\n");
      out.write("                    <li>PartNet (Lessons)</li>\n");
      out.write("                    <li>Yiannis Pavlosoglou (Lessons)</li>\n");
      out.write("                    <li>Eric Sheridan (Lessons)</li>\n");
      out.write("                    <li>Alex Smolen (Lessons)</li>\n");
      out.write("                    <li>Chuck Willis (Lessons)</li>\n");
      out.write("                    <li>Marcel Wirth (Lessons)</li>\n");
      out.write("                </ul>\n");
      out.write("                </p>\n");
      out.write("                <p>Did we miss you? Our sincere apologies, as we know there have\n");
      out.write("                    been many contributors over the years. If your name does not\n");
      out.write("                    appear in any of the lists above, please send us a note. We'll\n");
      out.write("                    get you added with no further sacrifices required.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
