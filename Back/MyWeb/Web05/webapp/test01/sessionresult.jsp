<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=EUC-KR>
<title>sessionresult</title>
</head>
<body>
<%
if(request.getMethod().equals("POST"))
{
	  if(session.isNew() || session.getAttribute("memberid")==null)
	  {
		  String id=request.getParameter("id");
		  String pw=request.getParameter("pw");
		  session.setAttribute("memberid",id);
		  session.setAttribute("memberpw",pw);
		  session.setMaxInactiveInterval(60);
	 

%>
ȸ�� ���� ó���Ǿ����ϴ� <br>
<%=session.getAttribute("memberid") %> ��  �ȳ��ϼ���<br>
<% }else{ %>
 ȸ�������� �ʿ䰡 �����ϴ� <br>
 �̹� ���� �ϼ˽��ϴ�  <br>
 <%  }} %>
</body>
</html>