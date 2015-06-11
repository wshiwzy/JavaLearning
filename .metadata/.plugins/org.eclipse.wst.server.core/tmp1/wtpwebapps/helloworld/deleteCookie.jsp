<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Cookie cooke=null;
	Cookie[] cookies = null;
	cookies=request.getCookies();
	if(cookies!=null && cookies.length>0){
		for(int i=0;i<cookies.length;i++)
		{
			Cookie o=cookies[i];
			out.println("CookieName:"+o.getName()+"\tCookieVlaue:"+o.getValue()+"<br>");
			o.setMaxAge(0);
			response.addCookie(o);
		}
	}
	else
	{
		out.println("No Cookies");
	}
%>
</body>
</html>