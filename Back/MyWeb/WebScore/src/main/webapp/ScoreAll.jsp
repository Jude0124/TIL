
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.entity.*"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Score All</title>
</head>
<body>
	<%
	ArrayList<Score> sm = (ArrayList<Score>) request.getAttribute("all");
	%>
	<table border=1 width="90%">
		<tr>
			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총 점</th>
			<th>평균</th>
			<th>학점</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		<%
		for (Score res : sm) {
		%>
		<tr>
			<td><%=res.getName()%></td>
			<td><%=res.getKor()%></td>
			<td><%=res.getEng()%></td>
			<td><%=res.getMat()%></td>
			<td><%=res.getTot()%></td>
			<td><%=res.getAvg()%></td>
			<td><%=res.getGrade()%></td>
			<td><a href="ScoreFind?name=<%=res.getName()%>"> 수정 </a></td>
			<td><a href="ScoreDelete?name=<%=res.getName()%>"> 삭제 </a></td>
		</tr>
		<%
		}
		%>
		<tr>
			<td align="center" colspan="9">
				<a href="ScoreInsert.html">입력</a>
			</td>
		</tr>
	</table>
</body>
</html>













