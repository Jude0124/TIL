<%@page import="com.test.Address"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
    <%@ page import="java.util.*, com.test.*" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>expressEX</title>
</head>
<body>

	<%= new Date() %>
	<% 
		out.print(new Date());
	%><br>

	<%= new Address().toString() %>
	<%
		out.print(new Address("111","1111","1111"));
	%>

	���ڿ��� ��� :
	<%="ȫ�浿"%><br>
	<br> ���ڵ� ��� :
	<%=100 * 200%><br>
	<br> ��ü ������ ��� :
	<%=new java.util.Date().toString()%><br>
	<br>
	<%="2�� ��� �� �غ���"%><br>
	<%="==================="%><br>
	<%
	for (int i = 1; i <= 9; i++) {
	%>

	<%="2 * " + i + " = " + i * 2%><br>

	<%
	} //for
	%>


</body>
</html>