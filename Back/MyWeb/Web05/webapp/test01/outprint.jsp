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
out.println("out �����Դϴ� ����� �ɱ��?\n ����� �ȴٸ� 8kb �Ѿ ���¶��ϴ�");
 }
//out.clearBuffer();
//out.println("��� ������ ũ��="+out.getBufferSize()+"<br>");
out.println("������ ���� ������ ũ�� ="+out.getRemaining()+"<br>");
out.flush();
out.println("flush �� ������ ���� ������ ũ�� ="+ out.getRemaining());
%>
</body>
</html>