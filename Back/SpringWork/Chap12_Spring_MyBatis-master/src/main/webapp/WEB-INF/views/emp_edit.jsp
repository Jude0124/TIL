<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	  <c:set var="dto" value="${cont }"></c:set>
	  <c:set var="dept" value="${dept }"></c:set>
	  <hr width="500" color="red">
	  	<h3>${dto.getEname() } 사원  정보 수정 폼</h3>
	  <hr width="500" color="red">
	
	  <form method="post" action="<%=request.getContextPath() %>/editOk.do">
        <table border="1" width="400" cellspacing="0">
          <tr>
          	<th>사원번호</th>
          	<td> <input name="empno" value="${dto.getEmpno() }" readonly> </td>
          </tr>
          <tr>
          	<th>사원명</th>
          	<td> <input name="ename" value="${dto.getEname() }" readonly> </td>
          </tr>
          <tr>
          	<th>담당업무</th>
          	<td> <input name="job" value="${dto.getJob() }"> </td>
          </tr>
          <tr>	
          	<th>관리자</th>
          	<td> <input name="mgr" value="${dto.getMgr() }"> </td>
          </tr>
          <tr>
          	<th>급 여</th>
          	<td> <input name="sal" value="${dto.getSal() }"> </td>
          </tr>
          <tr>
          	<th>보너스</th>
          	<td> <input name="comm" value="${dto.getComm() }"> </td>
          </tr>
          <tr>
          	<th>부서번호</th>
          	<td>
				<c:if test="${!empty dept }">
					<select name="deptno">
					  <c:forEach items="${dept }" var="i">
					    <c:if test="${i.getDeptno() == dto.getDeptno() }" >
					    	<option value="${i.getDeptno() }" selected>${i.getDname() } [${i.getDeptno() }]</option>
					    </c:if>
					  	<c:if test="${i.getDeptno() != dto.getDeptno() }" >
					    	<option value="${i.getDeptno() }">${i.getDname() } [${i.getDeptno() }]</option>
					    </c:if>
					  </c:forEach>
					</select>
				</c:if>	
          	</td>
          </tr>
          <tr>
          	<td colspan="2" align="center">
          		<input type="submit" value="수정">&nbsp;&nbsp;&nbsp;
          		<input type="reset" value="취소">
          	</td>
          </tr>
        </table>
	</form>
	<a href="select.do">[사원 목록]</a>
	</div>
</body>
</html>