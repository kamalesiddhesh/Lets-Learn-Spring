<%@page import="java.util.Set"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%-- <%
			String name = request.getAttribute("label").toString();
			out.println(name);
			
		%> --%>
		
		<%-- ${student} --%>
		
		
		<%-- <c:import url="https://www.telusko.com/"></c:import> --%>
		<%-- <c:out value= "Hello World sid"/> --%>
		
		
		<%-- ${student}	 --%>
		<c:forEach items= "${student}" var="s">
			${s.name} <br/>
		</c:forEach>
		

</body>
</html>