<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="sum" value="${param.kor + param.eng + param.mat}"/>
<c:set var="avg" value="${sum/3.0}"/>

<b>${param.name}</b>님의 총점은 ${sum}점이고 평균은 ${sum/3.0}이며 학점은 
<c:choose>
	<c:when test="${avg >= 90}">${grade = "A"}</c:when>
	<c:when test="${avg >= 80}">${grade = "B"}</c:when>
	<c:when test="${avg >= 70}">${grade = "C"}</c:when>
	<c:when test="${avg >= 60}">${grade = "D"}</c:when>
	<c:otherwise>${grade = "F"}</c:otherwise>
</c:choose> 입니다<br>
결과 : <c:if test="${avg >= 60}">합격</c:if><c:if test="${avg < 60}">불합격</c:if>
		
</body>
</html>