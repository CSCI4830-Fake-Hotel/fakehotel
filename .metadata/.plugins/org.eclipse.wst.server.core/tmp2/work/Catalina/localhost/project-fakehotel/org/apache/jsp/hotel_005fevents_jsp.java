/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-26 22:19:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import event.Event;

public final class hotel_005fevents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Hotel Events</title>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Noto+Sans&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        .flexExpand {\r\n");
      out.write("            flex: 1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            font-family: 'Noto Sans', sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #round1 {\r\n");
      out.write("            border-radius: 18px;\r\n");
      out.write("            width: 130px;\r\n");
      out.write("            height: 18px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #round2 {\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            height: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #check {\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            height: 25px;\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            margin: 8px 0;\r\n");
      out.write("            margin-left: 1.5rem;\r\n");
      out.write("            font-family: \"Noto Sans\", sans-serif;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=text] {\r\n");
      out.write("            width: 90%;\r\n");
      out.write("            padding: 0.5em;\r\n");
      out.write("            margin: 8px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=submit] {\r\n");
      out.write("            width: 90%;\r\n");
      out.write("            background-color: #AE91E5;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 14px 20px;\r\n");
      out.write("            margin: 8px 0;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-family: \"Noto Sans\", sans-serif;\r\n");
      out.write("            margin-left: 3em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button {\r\n");
      out.write("            letter-spacing: 0.13em;\r\n");
      out.write("            font-size: 0.8rem;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            padding: 0.75em;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("            background-color: #AE91E5;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: center;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .center {\r\n");
      out.write("            width: 800px;\r\n");
      out.write("            height: 260px;\r\n");
      out.write("            background:rgba(0, 0, 0, 0.5);\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-family: 'Noto Sans', sans-serif;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #background img {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: 45px;\r\n");
      out.write("            left: 0;\r\n");
      out.write("            z-index: -1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button:hover {\r\n");
      out.write("            background-color: rgba(0, 0, 0, 0.15);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button.outlined {\r\n");
      out.write("            border: 1px solid rgba(0, 0, 0, 0.5);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button.primary {\r\n");
      out.write("            background-color: #DAF7A6;\r\n");
      out.write("            color: black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button.disabled {\r\n");
      out.write("            color: rgba(0, 0, 0, 0.35)\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            font-family: 'Noto Sans', sans-serif;\r\n");
      out.write("            min-height: 100vh;\r\n");
      out.write("            font-size: small;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header {\r\n");
      out.write("            background-color: #AE91E5;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 0.5em 0.5rem;\r\n");
      out.write("            height: 45px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            border-bottom: 1px solid rgba(0, 0, 0, 0.5);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header h1 {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            margin-left: 0.25em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        header .button {\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        main {\r\n");
      out.write("            padding: 0.5em 0.5rem;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            padding: 0.3rem;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            opacity: 0.80;\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-size: medium;\r\n");
      out.write("            bottom: 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 0.1rem;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dateHolder {\r\n");
      out.write("            max-width: 60em;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .date {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: flex-start;\r\n");
      out.write("            margin-bottom: 2em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .date:last-child {\r\n");
      out.write("            margin-bottom: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .date.past .dateInfo {\r\n");
      out.write("            opacity: 0.05;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .date.today .dateInfo {\r\n");
      out.write("            background-color: rgba(0, 0, 0, 0.15);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dateInfo {\r\n");
      out.write("            flex: 0 0 3em;\r\n");
      out.write("            position: -webkit-sticky;\r\n");
      out.write("            position: sticky;\r\n");
      out.write("            top: 0.5rem;\r\n");
      out.write("            font-size: 1.25em;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: white;\r\n");
      out.write("            /* padding: 0.5em 0.25em; */\r\n");
      out.write("            /* line-height: 1; */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .dateInfo .day {\r\n");
      out.write("            font-size: 2em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .eventHolder {\r\n");
      out.write("            flex: 1;\r\n");
      out.write("            margin-left: 0.5em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .event {\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            margin-bottom: 1em;\r\n");
      out.write("            border-left: 0.5em solid #888;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .event.private {\r\n");
      out.write("            border-color: #C8A9D0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .event.public {\r\n");
      out.write("            border-color: #703380;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .event:last-child {\r\n");
      out.write("            margin-bottom: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .eventInfoHolder {\r\n");
      out.write("            display: flex;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .eventInfo {\r\n");
      out.write("            flex: 1;\r\n");
      out.write("            padding: 1em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .eventInfo h1 {\r\n");
      out.write("            font-size: 1.5em;\r\n");
      out.write("            margin: 0.25em 0;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .eventInfo h2 {\r\n");
      out.write("            font-size: 1.25em;\r\n");
      out.write("            margin: 0.25em 0;\r\n");
      out.write("            font-weight: normal;\r\n");
      out.write("            color: #888;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .eventIcon {\r\n");
      out.write("            padding: 1em;\r\n");
      out.write("            color: rgba(0, 0, 0, 0.15);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .eventActionHolder {\r\n");
      out.write("            text-align: right;\r\n");
      out.write("            border-top: 1px solid rgba(0, 0, 0, 0.08);\r\n");
      out.write("            padding: 0.5em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .home {\r\n");
      out.write("            color: white;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modal {\r\n");
      out.write("            display: none; /* Hidden by default */\r\n");
      out.write("            position: fixed; /* Stay in place */\r\n");
      out.write("            z-index: 1; /* Sit on top */\r\n");
      out.write("            padding-top: 100px; /* Location of the box */\r\n");
      out.write("            left: 0;\r\n");
      out.write("            top: 0;\r\n");
      out.write("            width: 100%; /* Full width */\r\n");
      out.write("            height: 100%; /* Full height */\r\n");
      out.write("            overflow: auto; /* Enable scroll if needed */\r\n");
      out.write("            background-color: rgb(0,0,0); /* Fallback color */\r\n");
      out.write("            background-color: rgba(0,0,0, 0.6); /* Black w/ opacity */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .modal-content {\r\n");
      out.write("            background-color: #fefefe;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border: 1px solid #888;\r\n");
      out.write("            width: 80%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("            /* The Close Button */\r\n");
      out.write("        .closeConf {\r\n");
      out.write("            color: #aaaaaa;\r\n");
      out.write("            float: right;\r\n");
      out.write("            font-size: 28px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .closeConf:hover,\r\n");
      out.write("        .closeConf:focus {\r\n");
      out.write("            color: #000;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("        .closeBlrm {\r\n");
      out.write("            color: #aaaaaa;\r\n");
      out.write("            float: right;\r\n");
      out.write("            font-size: 28px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .closeBlrm:hover,\r\n");
      out.write("        .closeBlrm:focus {\r\n");
      out.write("            color: #000;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .linkbutton {\r\n");
      out.write("         background-color: #888;\r\n");
      out.write("         border: none;\r\n");
      out.write("         color: white;\r\n");
      out.write("         padding: 20px 34px;\r\n");
      out.write("         text-align: center;\r\n");
      out.write("         text-decoration: none;\r\n");
      out.write("         display: inline-block;\r\n");
      out.write("         font-size: 15px;\r\n");
      out.write("         margin: 4px 2px;\r\n");
      out.write("         border-radius: 4px;\r\n");
      out.write("         cursor: pointer;\r\n");
      out.write("         }\r\n");
      out.write("    \r\n");
      out.write("    </style>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<form action=\"HotelServlet\" method=\"POST\" id=\"events_form\">\r\n");
      out.write("        <div id=\"confModal\" class=\"modal\">\r\n");
      out.write("            <div class=\"model-content\">\r\n");
      out.write("                <span class=\"closeConf\">&times;</span>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <img id=\"conference\" src=\"fancy_conference_room.jpg\" style=\"height:500px; width: 500px;margin-left: 32.75em;\">\r\n");
      out.write("                        <p style=\"font-size: medium;color: white;\" align=\"center\">General layout of our conference rooms. </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"ballroomModal\" class=\"modal\">\r\n");
      out.write("            <div class=\"model-content\">\r\n");
      out.write("                <span class=\"closeBlrm\">&times;</span>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <img id=\"ballroomA\" src=\"conference_room_a.jpg\" style=\"height:500px; width: 500px;margin-left: 15em;\">\r\n");
      out.write("                    <img id=\"ballroomB\" src=\"conference_room_b.jpg\" style=\"height:500px; width: 500px;margin-left: 1em;\">\r\n");
      out.write("                    <p style=\"font-size: medium;color: white;\" align=\"center\">On the left is a picture of the Grand Ballroom A; on the right, a picture of the Grand Ballroom B.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div id=\"background\">\r\n");
      out.write("        <img src=\"https://images.dailyhive.com/20190923083339/shutterstock_1508803526.jpg\">\r\n");
      out.write("    \t<header>\r\n");
      out.write("        \t<i class=\"fa fa-building-o\" aria-hidden=\"true\" style=\"font-size:30px;\"></i>\r\n");
      out.write("        \t<a href=\"hotel-mockup.html\" id=\"home\" class=\"home\"><h1>Fake Hotel</h1></a>\r\n");
      out.write("        \t<div class=\"flexExpand\"></div>\r\n");
      out.write("        \t<button type=\"submit\" class=\"button\" onClick=\"setPageSignIn()\">Sign In</button>\r\n");
      out.write("        \t<input type=\"hidden\" name=\"signInPage\" id=\"sign_in_page\"/>\r\n");
      out.write("        \t<button type=\"submit\" class=\"button\" onClick=\"setPage()\">View Current Events</button>\r\n");
      out.write("        \t<input type=\"hidden\" name=\"eventPage\" id=\"events_page\"/>\r\n");
      out.write("    \t</header>\r\n");
      out.write("    </div>\r\n");
      out.write("    <main>\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("            <a href=\"#\" class=\"linkbutton\" id=\"conferenceButton\">View Conference Room Layout</a>\r\n");
      out.write("            <a href=\"#\" class=\"linkbutton\" id=\"ballroomButton\">View Ballroom Layouts</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 List<Event> events = (ArrayList<Event>)request.getAttribute("events");
        	for(Event event: events) {
        
      out.write("\r\n");
      out.write("        <div class=\"date today\">\r\n");
      out.write("            <div class=\"dateInfo\">\r\n");
      out.write("                <div class=\"name\">");
      out.print(event.getDateName());
      out.write("</div>\r\n");
      out.write("                <div class=\"day\">");
      out.print(event.getDateDay());
      out.write("</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"eventHolder\">\r\n");
      out.write("                <div class=\"event public\">\r\n");
      out.write("                    <div class=\"eventInfoHolder\">\r\n");
      out.write("                        <div class=\"eventInfo\">\r\n");
      out.write("                            <h1 class=\"eventTitle\">");
      out.print(event.getEventTitle());
      out.write("</h1>\r\n");
      out.write("                            <h2 class=\"eventDescription\">");
      out.print(event.getEventDescription());
      out.write("</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("    </main>\r\n");
      out.write("    <footer>\r\n");
      out.write("        &copy; 2020 FakeHotel, a subsidiary of OtherFakeHotel. All rights reserved.\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script>\r\n");
      out.write("        var confModal = document.getElementById(\"confModal\");\r\n");
      out.write("        var ballroomModal = document.getElementById(\"ballroomModal\");\r\n");
      out.write("\r\n");
      out.write("        // Get the button that opens the modal\r\n");
      out.write("        var confBtn = document.getElementById(\"conferenceButton\");\r\n");
      out.write("        var blrmBtn = document.getElementById(\"ballroomButton\");\r\n");
      out.write("\r\n");
      out.write("        // Get the <span> element that closes the modal\r\n");
      out.write("        var spanConf = document.getElementsByClassName(\"closeConf\")[0];\r\n");
      out.write("        var spanBlrm = document.getElementsByClassName(\"closeBlrm\")[0];\r\n");
      out.write("\r\n");
      out.write("        // When the user clicks the button, open the modal \r\n");
      out.write("        confBtn.onclick = function() {\r\n");
      out.write("            confModal.style.display = \"block\";\r\n");
      out.write("        }\r\n");
      out.write("        blrmBtn.onclick = function() {\r\n");
      out.write("            ballroomModal.style.display = \"block\";\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // When the user clicks on <span> (x), close the modal\r\n");
      out.write("        spanConf.onclick = function() {\r\n");
      out.write("            confModal.style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("        spanBlrm.onclick = function() {\r\n");
      out.write("            ballroomModal.style.display = \"none\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function setPage() {\r\n");
      out.write("        \tvar set_page = document.getElementById('events_page');\r\n");
      out.write("        \tset_page.value = \"events_page\";\r\n");
      out.write("        \tvar form = document.getElementById('events_form');\r\n");
      out.write("        \tform.submit();\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function setPageSignIn() {\r\n");
      out.write("        \tvar set_page = document.getElementById('sign_in_page');\r\n");
      out.write("        \tset_page.value = \"sign_in\";\r\n");
      out.write("        \tvar form = document.getElementById('events_form');\r\n");
      out.write("        \tform.submit();\r\n");
      out.write("        }\r\n");
      out.write("        </script>\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
