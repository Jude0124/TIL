<%@ page language="java" contentType="text/html; charset=EUC-KR" 
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>comment.jsp</title>
</head>
<body>
	<!--  클라이언트에게 보이는 HTML 주석입니다  -->
	<%--  클라이언트에게 안 보이는 JSP주석입니다  --%>
	<%
		// JSP태그에서 사용되는  자바 주석입니다
		//자바코드를 작성할 수 있는 곳 = 스크립트릿(Scriptlet) 
	%>
	<h1>주석 실행 화면입니다 </h1>
	<%= application.getRealPath(".") %>
</body>
</html>

