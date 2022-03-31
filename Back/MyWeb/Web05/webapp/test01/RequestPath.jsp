<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>RequestPath</title>
</head>
<body>
 <h3> Request 주요 메소드의 리턴값  출력 </h3>
<font size="4">
JSP Request Method: <%=request.getMethod() %>
<br>
Request URI: <%= request.getRequestURI() %>
<br>
Request Protocol: <%= request.getProtocol() %>
<br>
Servlet path: <%= request.getServletPath() %>
<br>
Path info: <%=request.getPathInfo() %>
<br>
Query string: <%=request.getQueryString() %>
<br>
Content length: <%= request.getContentLength() %>
<br>
Content type: <%=request.getContentType() %>
<br>
Server name: <%= request.getServerName() %>
<br>
Server port: <%= request.getServerPort() %>
<br>
Remote user: <%= request.getRemoteUser() %>
<br>
Remote address: <%= request.getRemoteAddr() %>
<br>
Remote host: <%= request.getRemoteHost() %>
Locale: <%= request.getLocale() %>
</font>
</body>
</html>