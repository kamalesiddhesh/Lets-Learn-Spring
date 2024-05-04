<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>
    
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri ="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<s:setDataSource var="db" driver="com.mysql.jdbc.Driver" url= "jdbc:mysql://localhost:3306/my" user="root" password="password"/>
	
	<s:query var="rs" dataSource="${db}"> select * from gadgets</s:query>
	
	<c:forEach items="${rs.rows}" var="gadget"> 
			<br>
			<c:out value= "${gadget.gid}"></c:out> :
			<c:out value= "${gadget.gname}"></c:out> :
			<c:out value= "${gadget.price}"></c:out>
	</c:forEach>


</body>
</html>