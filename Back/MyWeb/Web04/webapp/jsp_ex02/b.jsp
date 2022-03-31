<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>b.jsp</h1>

	<%=application.getAttribute("a1")%><br>
	<%=session.getAttribute("s1")%><br>
	<%=request.getAttribute("r1")%><br>


	<a href = "c.jsp"> c.jsp</a>
</body>
</html>