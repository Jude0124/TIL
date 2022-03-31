<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="date" class="java.util.Date" />
<html>
<head>
<title> ~ </title></head>
<body>
<h3>
<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="short" /> <br />


Locale: <c:out value="${pageContext.request.locale.language}" />_<c:out value="${pageContext.request.locale.country}" />
<br><br><br>
<hr>
<fmt:timeZone value="GMT-7">
캘거리  GMT-7  : <fmt:formatDate value="${date}" type="both" dateStyle="full"
                   timeStyle="full"/>
</fmt:timeZone><br><br><br>
<hr>
<fmt:timeZone value="GMT-3.5">
세인트 존스  GMT-3.5: <fmt:formatDate value="${date}" type="both" dateStyle="full"
                   timeStyle="full"/>
</fmt:timeZone>
 
</body>
</html>
