<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<% response.setContentType("text/html"); %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3>����</h3>
�Ķ� �� ����:<c:out value="${empty param.name}" />
<c:if test="${empty param.name}">
<form>
�̸��� �����ּ���.<br>
    <input type="text" name="name">
    <input type="submit" value="Ȯ��">
</form>
</c:if>
<c:if test="${!empty param.name}">
    �ȳ��ϼ���. <c:out value="${param.name}"/>��.
</c:if>

