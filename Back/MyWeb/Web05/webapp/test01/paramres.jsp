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
이름</td>
<%=request.getParameter("username")%> </td>
</tr>
<tr>
가입했던 E-mail</td>
<%=request.getParameter("email")%></td>
</tr>
<tr>
연상질문</td>
<%=request.getParameter("MUN")%></td>
</tr>
<tr>
 질문에 대한 답</td>
 <%=request.getParameter("dap")%></td>
</table>
<br>
<font size="4"><i> 가입하신 E-mail로 임시 비밀번호를  전송하였습니다</i></font><br>
<hr>
<%
Enumeration<String>  eNames = request.getParameterNames();
while (eNames.hasMoreElements()) {
   String name = (String) eNames.nextElement();
    %> <%=name %><%} %>
</body>
</html>