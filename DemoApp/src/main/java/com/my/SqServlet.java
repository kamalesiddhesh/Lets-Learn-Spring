package com.my;

import java.io.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		
		int k=0;
//-------- Using Session Management------------------------------
//		HttpSession session = req.getSession();
//		k = (int) session.getAttribute("k");
		
//--------Using URL Rewriting------------------------------------
//		k =Integer.parseInt(req.getParameter("k"));
		
//----------Using Cookies-----------------
		
		Cookie cookies[] =req.getCookies();
		
		for(Cookie c: cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
				
		k = k*k;
		PrintWriter out = resp.getWriter();
		out.println("The Squared Result is : "+k);
				
		
		System.out.println("Sq called");
	}

}
