<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<%
	com.test.Address Alist02 = new com.test.Address();
	%>




	<jsp:useBean id="Alist" class="com.test.Address" />

	<%
	Alist02.setName(request.getParameter("name"));
	Alist02.setName(request.getParameter("addr"));
	Alist02.setName(request.getParameter("tel"));
	%>

	<jsp:setProperty name="Alist" property="*" />

	<jsp:getProperty name="Alist" property="name" />
	님 반갑습니다
	<br>
	<%= Alist02.getName() %>
	
	<%
		out.print(Alist02.getName());
	%>
	<jsp:getProperty name="Alist" property="name" />
	님 의 주소는
	<jsp:getProperty name="Alist" property="addr" />
	이고
	<br>전화번호는
	<jsp:getProperty name="Alist" property="tel" />
	입니다.
</body>
</html>