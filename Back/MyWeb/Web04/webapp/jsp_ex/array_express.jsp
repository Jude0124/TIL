<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>array_express</title>
</head>
  <body>
    <h2>�޼ҵ带 �̿��ؼ� ����� ���غ��� </h2>
    <%!
    void doubler(int []a)
    {
        for (int i = 0; i < a.length;i++) {
            a[ i ] *= 2;
        }
    }
    %>

    <%
        int array[] = {1, 2, 3, 4, 5};
        out.println("����� ���ϱ� ��<BR>");
        for (int i = 0; i < array.length; i++) {
            out.println("array[" + i + "] = " + array[i] + "<BR>");
        }
        
        doubler(array);
        
        out.println("<br> ����� ���� �� <BR>");
        for (int i = 0; i < array.length; i++) {
            out.println("array[" + i + "] = " +
                array[i] + "<BR>");
        }
    %>
  </body>
  </html>
