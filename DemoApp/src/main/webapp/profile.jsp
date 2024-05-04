<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%
		String url = "jdbc:mysql://localhost:3306/my";
		String user = "root";
		String pass = "password";
		String query = "select * from employees where eno=300";
		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
			
	%>

	ENO:  <%= rs.getInt(1) %> <br>
	Name: <%= rs.getString(2)%> <br>
	Salary: <%= rs.getInt(3)%> <br>
	City: <%= rs.getString(4)%> <br>
	

</body>
</html>