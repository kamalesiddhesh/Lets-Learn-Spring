package com.my;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		PrintWriter out = resp.getWriter();
		out.print("Hi ");
//----------------- Servlet Context-------------------
//		ServletContext ctx = getServletContext();
//		String s = ctx.getInitParameter("phone");
//		out.print(s);
		
//----------------- Servlet Config-------------------		
		ServletConfig cg = getServletConfig();
		String s1 = cg.getInitParameter("name");
		out.print(s1);
		
	}

}
