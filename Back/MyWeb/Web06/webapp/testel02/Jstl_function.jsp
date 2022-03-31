<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
<title> JSTL Function</title>
</head>
<body>
<h3>JSTL Function</h3>
<b>
    <c:set var="name" value="dominica & dominico"/>
    <c:out value="name: ${name}"/><br/><br/>
    <c:out value="length(name): ${fn:length(name)}"/><br/>
    <c:out value="toUpperCase(name): ${fn:toUpperCase(name)}"/><br/>
    <c:out value="toLowerCase(name): ${fn:toLowerCase(name)}"/><br/>
    <c:out value="substring(name,3,6): ${fn:substring(name,3,6)}"/><br/>
    <c:out value="substringBefore(name,'&'):   ${fn:substringBefore(name, '&')}"/><br/>
    <c:out value="substringAfter(name,'&'): ${fn:substringAfter(name, '&')}"/><br/>
 </b> 
</body>
</html>

