<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style="font-size: 1.5em;">
	<form action="<%=application.getContextPath()%>/insert_res.sp"
		method="Post">
<table>
<tr>
	<td>�̸�</td>
	<td><input type="text" name="name" /></td>
</tr>
<tr>
	<td>����</td>
	<td><input type="text" name="age" /></td>
</tr>
<tr>
	<td>���</td>
	<td><input type="text" name="hobby" /></td>
</tr>

<tr>
	<td><input type="submit" value="ȸ�� ���" /></td>
</tr>
</table>
</form>

</body>


</html>