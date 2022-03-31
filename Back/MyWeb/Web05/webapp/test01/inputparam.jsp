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
		<h3>비번을 잊으셨다면 연상질문에 답해주세요</h3>
		이 름 : <input type=text size=20 name=username><br> 가입했던
		E-mail : <input type=text size=20 name=email><br> 연상질문 :
		<select name=MUN>
			<option selected>선택할질문</option>
			<option>내가 다닌 초등학교는?</option>
			<option>나의 보물 1호는?</option>
			<option>나의 취미는?</option>
			<option>내가 가입한 날짜는?</option>
			<option>나의 어머님 성함은?</option>
		</select> 연상질문에 대한 나의 답 : <input type=text size=20 name=dap> <input
			type=submit value="확인"><input type=reset value="취소">
	</form>

</body>
</html>