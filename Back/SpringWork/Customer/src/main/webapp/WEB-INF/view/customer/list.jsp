<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head>
<body style="font-size:2.0em;margin: 150px 150px 150px 150px;">

<c:if test="${empty list}">
	<h3>고객 정보가 없습니다</h3>
</c:if>
<c:if test="${!empty list}">
	<h3>** 고객 정보 리스트 **</h3><hr>
	<c:forEach items="${list}"  var="ob">
		${ob.id} &nbsp;&nbsp;&nbsp; 
		${ob.password}	&nbsp;&nbsp;&nbsp; 
		${ob.name}<br>
	</c:forEach>
</c:if><br>
<a href="/Customer/index.html">홈 화면으로 이동</a>

</body>
</html>



