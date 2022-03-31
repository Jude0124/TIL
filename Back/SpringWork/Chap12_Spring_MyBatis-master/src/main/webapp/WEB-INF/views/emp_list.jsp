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
	  <hr width="500" color="red">
	  	<h3>EMP 테이블 전체 사원 목록</h3>
	  <hr width="500" color="red">
	  <table border="1" width="400" cellspacing="0">
	  	<tr bgcolor="#aabbcc">
	  		<th>사원번호</th> <th>사원명</th> 
	  		<th>담당업무</th> <th>부서번호</th>
	  	</tr>
	  	<c:set var="list" value="${total }"></c:set>
	    <c:if test="${!empty list }">
	      <c:forEach items="${list }" var="dto">
	      	<tr>
	      		<td>${dto.getEmpno() }</td>
	      		<td><a href="cont.do?no=${dto.getEmpno() }">${dto.getEname() }</a>
	      		</td>
	      		<td>${dto.getJob() }</td>
	      		<td>${dto.getDeptno() }</td>
	      	</tr>
	      </c:forEach>
	    </c:if>
	    
	    <c:if test="${empty list }">
	    	<tr>
	    		<td colspan="4" align="center">
	    			<h3>검색된 레코드가 없습니다.</h3>
	    		</td>
	    	</tr>
	    </c:if>
	    <tr>
	    	<td colspan="4" align="center">
	    		<input type="button" value="사원등록"
	    			   onclick="location.href='write.do'">
	    	</td>
	    </tr>
	  </table>
	</div>
</body>
</html>