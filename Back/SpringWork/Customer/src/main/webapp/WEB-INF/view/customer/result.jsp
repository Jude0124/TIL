<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html >
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head>
<body>
<c:if test="${!empty myresult}">
	${myresult}님의 고객정보등록이 완료 되었습니다<br>
	<a href="/Customer/index.html">홈 화면으로 이동</a>
</c:if>

<c:if test="${empty myresult}">
	이미 존재하거나 잘못 입력하셨습니다<br>
	다시 입력해 주세요<br>
	<a href="/Customer/insert.jsp">다시 입력</a>
</c:if>

