<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>includegoalmain</title>
</head>
<body>
<font size='4'>
<%@ page buffer="5kb" autoFlush="false" %>
Jsp���� ����ð��� �˾ƺ��� <br>
<%@ include file="goal01.jsp" %> <br>
<%@include file="goal02.html" %> <br>
<%@include file="goal01.jsp" %>
</font>
</body>
</html>