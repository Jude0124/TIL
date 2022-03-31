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
<h3>세션의 정보를 알아보자</h3>
isNew()  :<%= session.isNew() %><br><br>
세션 ID :   <%=session.getId() %><br><br>
세션의 생성시간 <%=new java.util.Date(session.getCreationTime()).toString()%> <br><br>
세션의 마지막 접속시간 <%= new java.util.Date(session.getLastAccessedTime()).toString() %><br><br>
세션의 action 시간<%= session.getMaxInactiveInterval() %> 초 <br>

</body>
</html>