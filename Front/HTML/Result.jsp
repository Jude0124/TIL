<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String product = request.getParameter("product");
	String qty = request.getParameter("qty");
	String address = request.getParameter("address");
	String email = request.getParameter("email");			// 안 받아짐. disable
	String mail = request.getParameter("mail");				// hidden. 잘 받아짐
	String password = request.getParameter("pw");
	String language = request.getParameter("language");
	String[] baseball = request.getParameterValues("baseball");
	String commant = request.getParameter("commant");
	String lang = request.getParameter("lang");
	String[] multi = request.getParameterValues("multi");
	// DB에 넣는 작업
	
	// DB 입력이 잘 됐으면 목록 페이지로 이동
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HTML에서 넘어온 값</h1>
	Product: <%=product %><br>
	Qty: <%=qty %><br>
	Password: <%=password %><br>
	Email: <%=email %><br>
	mail: <%=mail %><br>
	Address: <%=address %><br>
	Language: <%=language %><br>
	Lang: <%=lang %>
</body>
</html>