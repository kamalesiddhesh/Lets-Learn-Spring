<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri ="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="str" value="My Name is Siddhesh"></c:set>
	Length : ${f:length(str)} 
	
	<c:forEach items="${f:split(str,'a') }" var="s">
		<br>
		${s}
	</c:forEach>
	<br>
	
	Index : ${f:indexOf(str,'y')}
	<br>
	Is contains : ${f:contains(str,'y')}
	<br>
	<br>
	<c:if test="${f:contains(str,'Q') }">
			It has String
	</c:if>
	
	<br>
	<c:if test="${f:endsWith(str,'esh') }">
			It ends with String
	</c:if>
	
	<br>
	
	Capitalize : ${f:toUpperCase(str)}
	
	
</body>
</html>