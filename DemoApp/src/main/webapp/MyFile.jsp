<!-- >Directive : Used for import < -->
<%@page import="java.sql.*"%>
<%@page import="java.util.Scanner, java.util.Random"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<h2>Hello Siddhesh</h2>

	<%!
//----------Declaration - To write out side of service method of Servlets------------	
		int k = 10;
		Scanner sc = new Scanner(System.in);
		//Connection con = DriverManager
	
	%>

	<%
//----------Scriptlet - It will turn into body of service method in servlet 
		int i = 9;
		out.println(7+5);
	%>
	
	My Lucky Number is : <%= k %>

</body>
</html>