<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
 for(int i=0;i<=100;i++)
 {
out.println("out 연습입니다 출력이 될까요?\n 출력이 된다면 8kb 넘어간 상태랍니다");
 }
//out.clearBuffer();
//out.println("출력 버퍼의 크기="+out.getBufferSize()+"<br>");
out.println("사용되지 않은 버퍼의 크기 ="+out.getRemaining()+"<br>");
out.flush();
out.println("flush 후 사용되지 않은 버퍼의 크기 ="+ out.getRemaining());
%>
</body>
</html>