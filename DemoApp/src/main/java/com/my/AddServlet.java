package com.my;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
		
public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		
		PrintWriter out = resp.getWriter();
		
		out.println("result : "+k);
		
//		req.setAttribute("k",k);
		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req,resp);
		
		
// ----------- Using Session Management -----------------------
//		HttpSession session = req.getSession();
//		session.setAttribute("k",k);
//		resp.sendRedirect("sq"); 
		
		
//-------------- URL Rewriting ------------------------
//		resp.sendRedirect("sq?k="+k); 
		
// ------------- Using Cookies --------------------
//		Cookie cookie = new Cookie("k",k+"");
//		resp.addCookie(cookie);
//		resp.sendRedirect("sq");
		
		
	}

}
