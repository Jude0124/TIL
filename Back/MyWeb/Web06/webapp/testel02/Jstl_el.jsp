<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<% response.setContentType("text/html"); %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h3>코어 </h3>
<b>&lt;c:out></b>
<pre>
${1+2} <c:out value="${1+2}"/>
${1>3} <c:out value="${1>3}"/>
${1 gt 3} <c:out value="${1 gt 3}"/>
<c:out value="${'${'}test}"/>
escapeXml 속성; 기본값은 false
false: <c:out value="<b>bold</b> <,>,&,',\" " escapeXml="false"/>
true:  <c:out value="<b>bold</b> <,>,&,',\" " escapeXml="true"/>
<hr><b>&lt;c:set></b>
set session scope var "name": <c:set var="name" value="SKY" scope="session"/>
c:out name: <c:out value="${name}"/>
expression name: <%= session.getAttribute("name")%>
set page scope var "name": <c:set var="name">
  hello
</c:set>
c:out name: <c:out value="${pageScope.name}"/>
c:out sessionScope.name: <c:out value="${sessionScope.name}"/>
expression name: <%= session.getAttribute("name")%>
<hr><b>&lt;c:remove></b>
remove session scope var "name": <c:remove var="name" scope="session"/>
expression name: <%= session.getAttribute("name")%>
c:out sessionScope.name: <c:out value="${sessionScope.name}"/>

<hr><b>&lt;c:catch></b>
<c:catch var="errmsg">line1
<%=1/0 %>
line2
</c:catch>
<c:out value="${errmsg}"/>
</pre>
</body>
</html>