<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Showing Request</h1>
	<B>Request Method:</B>
	<%=request.getMethod() %><br>
	<B>Request URI:</B>
	<%= request.getRequestURI() %><br>
	<B>Request Protocol:</B>
	<%= request.getProtocol() %><br>
	<table border=1px;>
		<tr>
		<td>Header Name</td>
		<td>Header Vlaue</td>
		</tr>
		<% Enumeration<String> handerNames=request.getHeaderNames();
		
			while(handerNames.hasMoreElements())
			{
				String headerName= (String)handerNames.nextElement();
				session.setAttribute("headerName", headerName);
				%>
				<tr><td>${headerName}</td><td>${header[headerName]}</td></tr>
		<%	} %>
	</table>	
		${pageContext.request.requestURI} 		
</body>
</html>