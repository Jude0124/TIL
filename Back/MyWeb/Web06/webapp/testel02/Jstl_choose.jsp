<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<meta charset="EUC-KR">
 <body>
    <c:if test="${pageContext.request.method=='POST'}">입력한 값을 영어로 바꾸면  :
      <c:choose>
      <c:when test="${param.enter=='1'}">One
      <br />
      </c:when>
      <c:when test="${param.enter=='2'}">Two
      <br />
      </c:when>
      <c:when test="${param.enter=='3'}">Three
      <br />
      </c:when>
         <c:otherwise>
        <c:out value="${'더이상 변환되지않습니다'}" /> 
        <br />
      </c:otherwise>
    </c:choose>
    </c:if>
    <form method="post">숫자를 1에서 3까지 입력해주세요
        <input type="text" name="enter" />
      <input type="submit" value="확인" />
    <br />
    </form>
  </body>
</html>
