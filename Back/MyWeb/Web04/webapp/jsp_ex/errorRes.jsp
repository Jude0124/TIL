<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>errorRes</title>
</head>
<body>
	<h4>Error Message</h4>
	Error Type :
	<%=exception%>
	<br> Error Message :
	<%=exception.getMessage()%><br>
</body>
</html>