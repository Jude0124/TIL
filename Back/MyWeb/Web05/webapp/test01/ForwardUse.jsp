<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<FORM  method='GET'>
        
        <%= "현제 페이지는  ForwardUse.jsp 입니다" %>
	      <%      
      pageContext.forward("ForwardOne.jsp");
		%>
	 <%= "현제 페이지는  ForwardOne.jsp를 수행한후의 ForwardUse.jsp 입니다" %>  
 </FORM>
</body>
</html>