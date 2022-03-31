<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<% response.setContentType("text/html"); %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3>조건</h3>
파람 값 없음:<c:out value="${empty param.name}" />
<c:if test="${empty param.name}">
<form>
이름을 적어주세요.<br>
    <input type="text" name="name">
    <input type="submit" value="확인">
</form>
</c:if>
<c:if test="${!empty param.name}">
    안녕하세요. <c:out value="${param.name}"/>님.
</c:if>

