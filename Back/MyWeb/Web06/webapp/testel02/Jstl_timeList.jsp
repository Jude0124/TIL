<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<style type="text/css">
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 5px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<c:set var="now" value="<%=new java.util.Date()%>" />
	<table>
		<tr>
			<td colspan="2">Formatting: <fmt:formatDate value="${now}"
					type="both" timeStyle="long" dateStyle="long" />
			</td>
		</tr>

		<c:forEach var="zone" 	items="<%=java.util.TimeZone.getAvailableIDs()%>">
			<tr>
				<td ><c:out value="${zone}" /></td>
				<td ><fmt:timeZone value="${zone}">
						<fmt:formatDate value="${now}" timeZone="${zn}" type="both" />
					</fmt:timeZone></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
