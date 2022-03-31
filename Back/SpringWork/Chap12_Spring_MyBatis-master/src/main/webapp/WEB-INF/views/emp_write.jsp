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
	  	<h3>사원 등록 페이지</h3>
	  <hr width="500" color="red">
	
	  <form method="post" action="<%=request.getContextPath() %>/writeOk.do">
        <table border="1" width="400" cellspacing="0">
          <tr>
          	<th>사원번호</th>
          	<td> <input name="empno"> </td>
          </tr>
          <tr>
          	<th>사원명</th>
          	<td> <input name="ename"> </td>
          </tr>
          <tr>
          	<th>담당업무</th>
          	<td> <input name="job"> </td>
          </tr>
          <tr>	
          	<th>관리자</th>
          	<td> <input name="mgr"> </td>
          </tr>
          <tr>
          	<th>급 여</th>
          	<td> <input name="sal"> </td>
          </tr>
          <tr>
          	<th>보너스</th>
          	<td> <input name="comm"> </td>
          </tr>
          <tr>
          	<th>부서번호</th>
          	<td>
            <c:set var="codeNo" value="${dept }"></c:set>
				<c:if test="${!empty codeNo }">
					<select name="deptno">
					  <c:forEach items="${codeNo }" var="i">
					  	<option value="${i.getDeptno() }">${i.getDeptno() } - ${i.getDname() }</option>
					  </c:forEach>
					</select>
				</c:if>	
          	</td>
          </tr>
          <tr>
          	<td colspan="2" align="center">
          		<input type="submit" value="등록">&nbsp;&nbsp;&nbsp;
          		<input type="reset" value="취소">
          	</td>
          </tr>
        </table>
	</form>
	<a href="select.do">[사원 목록]</a>
	
	
	</div>
	
	
</body>
</html>