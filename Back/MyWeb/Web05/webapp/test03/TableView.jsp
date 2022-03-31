<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>TableView02</title>
</head>
<body>
	<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/MYSQL";
	String user = "root";
	String password = "mcys1309";
	conn = DriverManager.getConnection(url, user, password);
	Statement statement = conn.createStatement();
	ResultSet resultset = statement.executeQuery("select * from Test01");
	%>

	<h2>Test01 Table의 내용을 출력해보자</h2>

	<%
	while (resultset.next()) {	%>
	<%=resultset.getInt(1)%>
	<%=resultset.getString(2)%>
   <%=resultset.getString(3)%> <br>
	<%	}
	resultset.close();
	statement.close();
	conn.close();
	%>
	
</body>
</html>