package com.my;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/addAlien")
public class Alien extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int aid = Integer.parseInt(req.getParameter("aid"));
		String aname = req.getParameter("aname");
		PrintWriter out = res.getWriter();
		out.print("Welcome "+aname + " with AID: "+ aid);
	}

}
