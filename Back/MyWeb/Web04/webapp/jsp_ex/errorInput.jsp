<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="errorRes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>errorInput</title>
</head>


<%
/* 
	512k
	888888888888888888888888888888888888888888888888888
	
	8888888888888888888888888888888888888888888
	8888888888888888888888888888888888888888888
*/

%>
<body>
 <% String name=request.getParameter("name");
   if(name.equals("ȫ�浿"))
   {
	    name= "�̸��� �ԷµǾ����ϴ�";
    }
  %>

    <h4> <%=name %> </h4>

</body>
</html>