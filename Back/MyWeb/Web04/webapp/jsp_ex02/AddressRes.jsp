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
	�� �ݰ����ϴ�
	<br>
	<%= Alist02.getName() %>
	
	<%
		out.print(Alist02.getName());
	%>
	<jsp:getProperty name="Alist" property="name" />
	�� �� �ּҴ�
	<jsp:getProperty name="Alist" property="addr" />
	�̰�
	<br>��ȭ��ȣ��
	<jsp:getProperty name="Alist" property="tel" />
	�Դϴ�.
</body>
</html>