package com.my;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ad")
public class DemoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		
		String name= "Siddhesh";
		
		List<Student> studs = Arrays.asList(new Student(1,"Siddhesh"),new Student(2,"Manav"),new Student(3,"Pratiksha"));
		
		
		
		req.setAttribute("student",studs);
		RequestDispatcher rd = req.getRequestDispatcher("Display.jsp");
		rd.forward(req,resp);
	}

}
