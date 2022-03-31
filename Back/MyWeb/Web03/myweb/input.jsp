<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- http://localhost:8787/myweb/myres?myid=1&mypw=2 -->
 <form action="/myweb/myres" method="post">
 	ID : <input type = "text" name ="myid" /> <br>
 	pw : <input type = "text" name ="mypw" /> <br>
 
 	<input type = "submit" value = "ok" />
 	<input type = "reset" value = "reset" />
 
 </form>

</body>
</html>