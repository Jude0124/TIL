<%@ page language="java" contentType="text/html; charset=EUC-KR" 
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>comment.jsp</title>
</head>
<body>
	<!--  Ŭ���̾�Ʈ���� ���̴� HTML �ּ��Դϴ�  -->
	<%--  Ŭ���̾�Ʈ���� �� ���̴� JSP�ּ��Դϴ�  --%>
	<%
		// JSP�±׿��� ���Ǵ�  �ڹ� �ּ��Դϴ�
		//�ڹ��ڵ带 �ۼ��� �� �ִ� �� = ��ũ��Ʈ��(Scriptlet) 
	%>
	<h1>�ּ� ���� ȭ���Դϴ� </h1>
	<%= application.getRealPath(".") %>
</body>
</html>

