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
        
        <%= "���� ��������  ForwardUse.jsp �Դϴ�" %>
	      <%      
      pageContext.forward("ForwardOne.jsp");
		%>
	 <%= "���� ��������  ForwardOne.jsp�� ���������� ForwardUse.jsp �Դϴ�" %>  
 </FORM>
</body>
</html>