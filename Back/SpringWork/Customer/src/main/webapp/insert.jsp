<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h3>** 고객 정보를 입력하시오 **</h3>  <!-- servlet에서 *.do로 url 맵핑, Controller로 이동한다  -->
	<form action="/Customer/customerInsert.do" method="post">
		아이디 : <input type="text" name="id"><br> 
		패스워드 : <input 	type="password" name="password"><br>
		 고객명 : <input 	type="text" name="name"><br> 
		 <input type="submit"		value="등록">
		  <input type="reset" value="재작성">
	</form>
</body>
</html>






