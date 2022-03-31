<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<c:set var="dto" value="${cont }"></c:set>
	<c:if test="${!empty dto }">
	<hr width="500" color="red">
		<h3>${dto.getEname() }사원 상세 목록</h3>	
	<hr width="500" color="red">
	<table border="1" width="400" cellspacing="0">
	  <tr>
	  	<th>사원번호</th>
	  	<td>${dto.getEmpno() }</td>
	  </tr>
	  <tr>
	  	<th>사원명</th>
	  	<td>${dto.getEname() }</td>
	  </tr>
	  <tr>
	  	<th>담당업무</th>
	  	<td>${dto.getJob() }</td>
	  </tr>
	  <tr>
	  	<th>부서 번호</th>
	  	<td>${dto.getDeptno() }</td>
	  </tr>
	  <tr>
	  	<th>관리자 사번</th>
	  	<td>${dto.getMgr() }</td>
	  </tr>
	  <tr>
	  	<th>급 여</th>
	  	<td>${dto.getSal() }</td>
	  </tr>
	  <tr>
	  	<th>보너스</th>
	  	<td>${dto.getComm() }</td>
	  </tr>
	  <tr>
	  	<th>입사일자</th>
	  	<td>${dto.getHiredate() }</td>
	  </tr>
	  <tr>
	  	<td colspan="2" align="center">
	  		<input type="button" value="수정"
	  		       onclick="location.href='edit.do?no=${dto.getEmpno()}'">
	  		<input type="button" value="삭제"
	  		       onclick="location.href='delete.do?no=${dto.getEmpno()}'">
	  		<input type="button" value="목록"
	  		       onclick="location.href='select.do'">
	  	</td>
	  </tr>
	
	</table>
	</c:if>
	
	
	</div>



</body>
</html>