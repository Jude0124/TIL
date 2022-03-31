<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.entity.*"%>

<%
List<ScoreEntity> all = (List<ScoreEntity>) request.getAttribute("all");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
<style type="text/css">
.t1 {
	width: 800px;
	border-spacing: 10px;
	margin: 100px 100px 100px 100px;
	box-sizing: inherit;
	border: 1px solid blue;
	font-size: 2em;
}
</style>
</head>
<body>
	<table class="t1">
		<thead>
			<tr>
				<th>name</th>
				<th>kor</th>
				<th>eng</th>
				<th>mat</th>
				<th>tot</th>
				<th>avg</th>
				<th>grad</th>
				<th>delete</th>
				<th>update</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="se" items="${requestScope.all}">
				<tr class="odd">
					<td><c:out value="${se.name}" /></td>
					<td><c:out value="${se.kor}" /></td>
					<td><c:out value="${se.eng}" /></td>
					<td><c:out value="${se.mat}" /></td>
					<td><c:out value="${se.tot}" /></td>
					<td><c:out value="${se.avg}" /></td>
					<td><c:out value="${se.grad}" /></td>
					<td><a href="delete.do?del_name=${se.name} ">삭제 </a></td>
					<td><a href="find.do?find_name=${se.name} "> 수정 </a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	<font style="font-size: 2em;"> <%
 String url = request.getContextPath();
 %>
		<a href='<%=url%>/score/input.do'> 입력 </a>
	</font>
</body>
</html>








