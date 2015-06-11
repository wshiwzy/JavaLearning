<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2>javabean Test</h2>
<jsp:useBean id="test" class="com.john.javabean.TestBean"/>
<jsp:setProperty name="test" property="message" value="hello jsp..."/>

<p>got message</p>
<jsp:getProperty name="test" property="message"/>
</center>
</body>
</html>