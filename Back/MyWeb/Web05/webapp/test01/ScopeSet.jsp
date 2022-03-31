<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<head>
<meta  charset="EUC-KR">
<title>ScoreSet</title>
</head>
<body>
<%
pageContext.setAttribute("id","jkh6655");
String id=(String)pageContext.getAttribute("id");
out.println(id);
request.setAttribute("name","Dominico");
String name=(String)request.getAttribute("name");
out.println(name);


session.setAttribute("addr","seoul");
String addr=(String)session.getAttribute("addr");
out.println(addr);

application.setAttribute("tel","070-0000-0000");
String tel=(String)application.getAttribute("tel");
out.println(tel);
%>
<form action='Scoperes.jsp' method='post'>
<br>
<input type="submit" value="확인" > 
</form>
</body>
</html>