<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="EUC-KR">
<title>import</title>
</head>
<body>
<form method="POST">  
 ���� �������� Jstl_import.jsp������ �Դϴ�. 
<br> import�� �������� �Է��ϼ���     
 <input type="text" name="url" size="40"/>
            <p align="center">
              <input type="submit" value="Submit" name="submit" />
              <input type="reset" value="Reset" name="reset" />
            </p>
      <p>&#160;</p>
    </form>
    <c:if test="${pageContext.request.method=='POST'}">
      <hr>
      <c:import url="${param.url}"/>
    </c:if>
</body>
</html>