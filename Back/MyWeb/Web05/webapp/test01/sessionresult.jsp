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
회원 인증 처리되었습니다 <br>
<%=session.getAttribute("memberid") %> 님  안녕하세요<br>
<% }else{ %>
 회원인증할 필요가 없습니다 <br>
 이미 인증 하셧습니다  <br>
 <%  }} %>
</body>
</html>