<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<head>
<meta  charset=EUC-KR>
<title>Insert title here</title>
</head>
<body>
<%session.setMaxInactiveInterval(1*60); %>
<h3>������ ������ �˾ƺ���</h3>
isNew()  :<%= session.isNew() %><br><br>
���� ID :   <%=session.getId() %><br><br>
������ �����ð� <%=new java.util.Date(session.getCreationTime()).toString()%> <br><br>
������ ������ ���ӽð� <%= new java.util.Date(session.getLastAccessedTime()).toString() %><br><br>
������ action �ð�<%= session.getMaxInactiveInterval() %> �� <br>

</body>
</html>