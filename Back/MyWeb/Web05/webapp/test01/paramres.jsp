<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
th, td { padding: 5px; }
</style>
</head>
<body>
<%request.setCharacterEncoding("euc-kr"); %>
<table border="1" >
<tr>
�̸�</td>
<%=request.getParameter("username")%> </td>
</tr>
<tr>
�����ߴ� E-mail</td>
<%=request.getParameter("email")%></td>
</tr>
<tr>
��������</td>
<%=request.getParameter("MUN")%></td>
</tr>
<tr>
 ������ ���� ��</td>
 <%=request.getParameter("dap")%></td>
</table>
<br>
<font size="4"><i> �����Ͻ� E-mail�� �ӽ� ��й�ȣ��  �����Ͽ����ϴ�</i></font><br>
<hr>
<%
Enumeration<String>  eNames = request.getParameterNames();
while (eNames.hasMoreElements()) {
   String name = (String) eNames.nextElement();
    %> <%=name %><%} %>
</body>
</html>