<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>inputparam</title>
<style type="text/css">
* {
	padding-top: 10px;
	margin-bottom: 10px;
}
</style>
</head>
<body>
	<form action="paramres.jsp" method="Post">
		<h3>����� �����̴ٸ� ���������� �����ּ���</h3>
		�� �� : <input type=text size=20 name=username><br> �����ߴ�
		E-mail : <input type=text size=20 name=email><br> �������� :
		<select name=MUN>
			<option selected>����������</option>
			<option>���� �ٴ� �ʵ��б���?</option>
			<option>���� ���� 1ȣ��?</option>
			<option>���� ��̴�?</option>
			<option>���� ������ ��¥��?</option>
			<option>���� ��Ӵ� ������?</option>
		</select> ���������� ���� ���� �� : <input type=text size=20 name=dap> <input
			type=submit value="Ȯ��"><input type=reset value="���">
	</form>

</body>
</html>