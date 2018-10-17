package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.webgoat.session.WebSession;

public final class main_005fnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

    WebSession webSession = ((WebSession) session.getAttribute(WebSession.SESSION));

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("        <!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("        <!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("        <!--[if gt IE 8]><!-->\n");
      out.write("\n");
      out.write("        <!--  CSS -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\"/>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <!-- Fonts from Font Awsome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\"/>\n");
      out.write("        <!-- CSS Animate -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\"/>\n");
      out.write("        <!-- Custom styles for this theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\"/>\n");
      out.write("        <!--  end of CSS -->\n");
      out.write("\n");
      out.write("        <!-- JS -->\n");
      out.write("        <script src=\"js/jquery/jquery-1.10.2.min.js\"></script>\n");
      out.write("        <script src=\"js/angular/angular.min.js\"></script>\n");
      out.write("        <!-- angular modules -->\n");
      out.write("        <script src=\"js/angular/angular-animate.min.js\"></script>\n");
      out.write("        <script src=\"js/angular/ui-bootstrap-tpls-0.11.0.min.js\"></script>\n");
      out.write("        <!-- Feature detection -->\n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/html5shiv.js\"></script>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!--Global JS-->\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery_form/jquery.form.js\"></script>  \n");
      out.write("        <script src=\"plugins/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/application.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var goat = angular.module(\"goatApp\", ['ngAnimate', 'ui.bootstrap']);\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/goatConstants.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/goatUtil.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/goatData.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/goatLesson.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/goatControllers.js\"></script>\n");
      out.write("        <!-- end of JS -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("        <title>WebGoat</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"animated fadeIn\" ng-app=\"goatApp\">\n");
      out.write("        <section id=\"container\" ng-controller=\"goatLesson\">\n");
      out.write("            <header id=\"header\">\n");
      out.write("                <!--logo start-->\n");
      out.write("                <div class=\"brand\">\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/start.mvc\" class=\"logo\"><span>Web</span>Goat</a>\n");
      out.write("                </div>\n");
      out.write("                <!--logo end-->\n");
      out.write("                <div class=\"toggle-navigation toggle-left\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" id=\"toggle-left\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Toggle Navigation\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </button>\n");
      out.write("                </div><!--toggle navigation end-->\n");
      out.write("                <div class=\"lessonTitle\" >\n");
      out.write("                    <h1 id=\"lessonTitle\"></h1>\n");
      out.write("                </div><!--lesson title end-->\n");
      out.write("                <div class=\"user-nav pull-right\" style=\"margin-right: 75px;\">\n");
      out.write("                    <div class=\"dropdown\" style=\"display:inline\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default dropdown-toggle\" id=\"dropdownMenu1\" ng-disabled=\"disabled\">\n");
      out.write("                            <i class=\"fa fa-user\"></i> <span class=\"caret\"></span>\n");
      out.write("                        </button>                   \n");
      out.write("                        <ul class=\"dropdown-menu dropdown-menu-left\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("                            <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">Logout</a></li>\n");
      out.write("                            <li role=\"presentation\" class=\"divider\"></li>     \n");
      out.write("                            <li role=\"presentation\" class=\"disabled\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">User: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\n");
      out.write("                            <li role=\"presentation\" class=\"disabled\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Role: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\n");
      out.write("                            <li role=\"presentation\" class=\"divider\"></li>   \n");
      out.write("                            <li role=\"presentation\" class=\"disabled\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></li>\n");
      out.write("                            <li role=\"presentation\" class=\"disabled\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Build: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${build}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</a></li>                            \n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default right_nav_button\" ng-click=\"showAbout()\" data-toggle=\"tooltip\" title=\"About WebGoat\">\n");
      out.write("                        <i class=\"fa fa-info\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"mailto:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contactEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("?Subject=Webgoat%20feedback\" target=\"_top\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default right_nav_button\"data-toggle=\"tooltip\" title=\"Contact Us\">\n");
      out.write("                            <i class=\"fa fa-envelope\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <!--sidebar left start-->\n");
      out.write("            <aside class=\"sidebar\" >\n");
      out.write("                <div id=\"leftside-navigation\" ng-controller=\"goatMenu\" class=\"nano\">\n");
      out.write("                    <ul class=\"nano-content\">\n");
      out.write("                        <li class=\"sub-menu\" ng-repeat=\"item in menuTopics\">\n");
      out.write("                            <a ng-click=\"accordionMenu(item.id)\" href=\"\"><i class=\"fa {{item.class}}\"></i><span>{{item.name}}</span></a><!-- expanded = !expanded-->\n");
      out.write("                            <ul class=\"slideDown lessonsAndStages {{item.displayClass}}\" id=\"{{item.id}}\" isOpen=0>\n");
      out.write("                                <li ng-repeat=\"lesson in item.children\" class=\"{{lesson.selectedClass}}\">\n");
      out.write("                                    <a ng-click=\"renderLesson(lesson.id, lesson.link, {showSource: lesson.showSource, showHints: lesson.showHints})\" id=\"{{lesson.id}}\" class=\"{{lesson.selectedClass}}\" title=\"link to {{lesson.name}}\" href=\"\">{{lesson.name}}</a><span class=\"{{lesson.completeClass}}\"></span>\n");
      out.write("                                    <span ng-repeat=\"stage in lesson.children\">\n");
      out.write("                                        <a ng-click=\"renderLesson(stage.id, stage.link, {showSource: stage.showSource, showHints: stage.showHints})\" class=\"selectedClass\" id=\"{{stage.id}}\"  title=\"link to {{stage.name}}\" href=\"\">{{stage.name}}</a><span class=\"{{stage.completeClass}}\"></span>\n");
      out.write("                                    </span>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul> \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </aside>\n");
      out.write("            <!--sidebar left end-->\n");
      out.write("            <!--main content start-->\n");
      out.write("            <section class=\"main-content-wrapper\">\n");
      out.write("                <section id=\"main-content\" > <!--ng-controller=\"goatLesson\"-->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <div class=\"col-md-12\" align=\"left\">\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                    <div class=\"panel-body\">\n");
      out.write("                                        <button type=\"button\" id=\"showSourceBtn\" ng-show=\"showSource\" class=\"btn btn-primary btn-xs\" ng-click=\"showLessonSource()\">Java [Source]</button>\n");
      out.write("                                        <button type=\"button\" id=\"showSolutionBtn\" class=\"btn btn-primary btn-xs\" ng-click=\"showLessonSolution()\">Solution</button>\n");
      out.write("                                        <button type=\"button\" id=\"showPlanBtn\" class=\"btn btn-primary btn-xs\" ng-click=\"showLessonPlan()\">Lesson Plan</button>\n");
      out.write("                                        <button type=\"button\" id=\"showHintsBtn\" ng-show=\"showHints\" class=\"btn btn-primary btn-xs\"  ng-click=\"viewHints()\">Hints</button>\n");
      out.write("                                        <button type=\"button\" id=\"restartLessonBtn\"  class=\"btn btn-xs\"  ng-click=\"restartLesson()\">Restart Lesson</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"lessonHelp\" id=\"lesson_hint_row\">\n");
      out.write("                                    <h4>Hints</h4>\n");
      out.write("                                    <div class=\"panel\" >\n");
      out.write("                                        <div class=\"panel-body\" id=\"lesson_hint\">\n");
      out.write("                                            <span class=\"glyphicon-class glyphicon glyphicon-circle-arrow-left\" id=\"showPrevHintBtn\" ng-click=\"viewPrevHint()\"></span>\n");
      out.write("                                            <span class=\"glyphicon-class glyphicon glyphicon-circle-arrow-right\" id=\"showNextHintBtn\" ng-click=\"viewNextHint()\"></span>\n");
      out.write("                                            <br/>\n");
      out.write("                                            <span ng-show=\"showHints\" bind-html-unsafe=\"curHint\"></span>\n");
      out.write("                                            <!--<span id=\"curHintContainer\"></span>-->\n");
      out.write("                                        </div>                                    \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"panel\" >\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson_content\">    \n");
      out.write("                                        <b>This should default to the \"How to Work with Webgoat\" lesson</b>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--col-md-8 end-->\n");
      out.write("                        <div class=\"col-md-4\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                    <div class=\"panel-body\">\n");
      out.write("                                        <div align=\"left\">\n");
      out.write("                                            <h3>Cookies / Parameters</h3>\n");
      out.write("                                        </div>\n");
      out.write("                                        <hr />\n");
      out.write("                                        <div id=\"cookiesAndParamsView\">\n");
      out.write("                                            <div class=\"cookiesView\">\n");
      out.write("                                                <h4>Cookies</h4>\n");
      out.write("                                                <div class=\"cookieContainer\" ng-repeat=\"cookie in cookies\">\n");
      out.write("                                                    <table class=\"cookieTable table-striped table-nonfluid\" >\n");
      out.write("                                                        <thead>\n");
      out.write("                                                            <tr><th class=\"col-sm-1\"></th><th class=\"col-sm-1\"></th></tr> <!-- Field / Value -->\n");
      out.write("                                                        </thead>\n");
      out.write("                                                        <tbody>\n");
      out.write("                                                            <tr ng-repeat=\"(key, value) in cookie\">\n");
      out.write("                                                                <td>{{key}}</td>\n");
      out.write("                                                                <td>{{value}}</td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                        </tbody>\n");
      out.write("                                                        <!--<li ng-repeat=\"(key, value) in cookie\">{{key}} :: {{ value}} </td>-->\n");
      out.write("                                                        <!--</ul>-->\n");
      out.write("                                                    </table>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div id=\"paramsView\"> <!--class=\"paramsView\"-->\n");
      out.write("                                                <h4>Params</h4>\n");
      out.write("                                                <table class=\"paramsTable table-striped table-nonfluid\" id=\"paramsTable\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr><th>Param</th><th>Value</th></tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                        <tr ng-repeat=\"param in parameters\">\n");
      out.write("                                                            <td>{{param.name}}</td>\n");
      out.write("                                                            <td>{{param.value}}</td>\n");
      out.write("                                                        </tr>\t\t\t\t\t\t\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--col-md-4 end-->         \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"lessonHelpsWrapper\">\n");
      out.write("                        <!--div class=\"row lessonHelp\" id=\"lesson_hint_row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h4>Hints</h4>\n");
      out.write("                                <div class=\"panel\" >\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson_hint\">\n");
      out.write("                                        <span class=\"glyphicon-class glyphicon glyphicon-circle-arrow-left\" id=\"showPrevHintBtn\" ng-click=\"viewPrevHint()\"></span>\n");
      out.write("                                        <span class=\"glyphicon-class glyphicon glyphicon-circle-arrow-right\" id=\"showNextHintBtn\" ng-click=\"viewNextHint()\"></span>\n");
      out.write("                                        <br/>\n");
      out.write("                                        {{curHint}}\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div-->\n");
      out.write("                        <div class=\"row lessonHelp\" id=\"lesson_cookies_row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h4>Lesson Parameters and Cookies</h4>\n");
      out.write("                                <div class=\"panel\" >\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson_cookies\">\t\n");
      out.write("\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>   \n");
      out.write("                        <div class=\"row lessonHelp\" id=\"lesson_hint_row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h4>Lesson Hints</h4>\n");
      out.write("                                <div class=\"panel\" >\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson_hint\">\t\n");
      out.write("\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                 \n");
      out.write("                        <div class=\"row lessonHelp\" id=\"lesson_plan_row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h4>Lesson Plan</h4>\n");
      out.write("                                <div class=\"panel\" >\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson_plan\">\n");
      out.write("                                        <!-- allowing jQuery to handle this one -->\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"row lessonHelp\" id=\"lesson_solution_row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h4>Lesson Solution</h4>\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson_solution\">\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"row lessonHelp\" id=\"lesson_source_row\">\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <h4>Lesson Source Code</h4>\n");
      out.write("                                <div class=\"panel\">\n");
      out.write("                                    <div class=\"panel-body\" id=\"lesson_source\">\n");
      out.write("                                        <pre>{{source}}</pre>\n");
      out.write("                                    </div>                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!--main content end-->\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!--main content end-->\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                //TODO merge appliction.js code into other js files\n");
      out.write("                app.init();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- About WebGoat Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"aboutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-lg\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../pages/about.jsp", out, false);
      out.write(" \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/main_new.jsp(87,91) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("j_spring_security_logout");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
