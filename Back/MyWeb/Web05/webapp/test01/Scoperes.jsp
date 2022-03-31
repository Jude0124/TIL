<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Scoperes</title>
</head>
<body>
<%
String id=(String)pageContext.getAttribute("id");
out.println(id);

String name=(String)request.getAttribute("name");
out.println(name);



String addr=(String)session.getAttribute("addr");
out.println(addr);


String tel=(String)application.getAttribute("tel");
out.println(tel);
%>
</body>
</html>