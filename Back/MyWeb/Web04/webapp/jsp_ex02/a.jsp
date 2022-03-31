<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>a.jsp</h1>
	<%=application.getContextPath()%>
	<br />
	<%=application.getServerInfo()%>
	<br />
	<%=application.getServletContextName()%>
	<br />
	<%=application.getRealPath("/")%>

	<hr>
	<%=request.getContextPath()%>
	<hr>

	<%
	application.setAttribute("a1", new String("a1"));
	session.setAttribute("s1", new String("s1"));
	request.setAttribute("r1", new String("r1"));
	%>
	
	<a href = "b.jsp"> b.jsp</a>


</body>
</html>