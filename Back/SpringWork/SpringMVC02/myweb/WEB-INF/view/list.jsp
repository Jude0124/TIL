<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="font-size: 1.5em;">
	all_list
	<table border="1">
		<tr>
			<th>이름</th>
			<th>나이</th>
			<th>취미</th>
		</tr>
		<c:if test="${!empty all_list}">
			<c:forEach items="${all_list}" var="ob">
				<tr>
					<td>${ob.name}</td>
					<td>${ob.age}</td>
					<td>${ob.hobby}</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
	<a href="<%=application.getContextPath()%>/index.html">처음화면</a>
</body>
</html>