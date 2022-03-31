<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
  if(request.getParameter("userid").equals("abc") &&
		  request.getParameter("userpwd").equals("1234")  ) {
  
%>
		{
		"result" : "ok"
		}
<%		
	}else{
%>
		{
		"result" : "fail"
		}
<%
	}
%>