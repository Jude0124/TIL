<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<title>Query Example</title>
<style type="text/css">
td, th { 
    padding: 10px; 
    border-bottom: 1px solid #ccc; 
    text-align: left;     
    }
</style>
</head>
<body>
	<sql:query var="score" dataSource="jdbc/myoracle">
select name,kor,eng,mat from Score
</sql:query>

	<table>
	<caption> { Score table }</caption>
		<tr>
			<%-- 필드의 정보를 출력한다.            --%>
			<c:forEach var="columnName" items="${score.columnNames}">
				<th><c:out value="${columnName}" /></th>
			</c:forEach>

			<%-- 데이터를 한 줄씩 출력한다.         --%>
			<c:forEach var="row" items="${score.rowsByIndex}">
				<tr>

					<%-- 필드의 길이만큼 반복한다.          --%>
					<c:forEach var="column" items="${row}" varStatus="i">
						<td><c:out value="${column}" /></td>

					</c:forEach>

				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>