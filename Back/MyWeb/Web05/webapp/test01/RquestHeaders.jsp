<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>RequestHeaders</title>
<style>
th, td { padding: 4px; }
</style>
</head>
<body>
	<h4>HTTP Request Headers Received(http 요청정보)</h4>
	<table border="1">
		<%
			Enumeration<String> eNames = request.getHeaderNames();
			while (eNames.hasMoreElements()) {
				String name =  eNames.nextElement();
				String value = Prn(request.getHeader(name));
		%>
		<tr>
			<%=name%></td>
			<%=value%></td>
		</tr>
		<%
			}
		%>
	</table>
	<hr>
	The browser you are using is : <%=request.getHeader("User-Agent")%>
	<hr>
</body>
</html>
<%!private String Prn(String value) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			sb.append(c);
			if (c == ';')
				sb.append("<br>");
		}
		return sb.toString();
}%>


