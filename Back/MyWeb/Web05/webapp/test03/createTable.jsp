<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="EUC-KR">
<title>createTable</title>
</head>
<body>
	<%
	Connection conn = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/MYSQL";
		String user = "root";
		String password = "mcys1309";
		conn = DriverManager.getConnection(url, user, password);

		Statement statement = conn.createStatement();
		String command = "CREATE TABLE EMPTEST(ID int(4),Name varchar(50))";
		statement.executeUpdate(command);
		out.println("테이블 생성이 완료되었습니다");
	} catch (Exception e) {
		out.println(e.getMessage());
	}
	%>
</body>
</html>