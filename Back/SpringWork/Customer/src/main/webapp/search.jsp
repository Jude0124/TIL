<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head>
<body>
<h3>검색하려는 고객의 ID 를 입력해 주세요...</h3>
<hr>
<form method="post" action="/Customer/customerSearch.do">
ID : <input type="text" name="id">
<input type="submit" value="검색">
</form>
</body>
</html>

