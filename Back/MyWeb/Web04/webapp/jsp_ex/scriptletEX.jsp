<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>scriptletEX</title>
</head>
<body>

    <%!
    int factorial(int n)
    {
        if (n == 1) {
            return n;
                  }
        else {
            return n * factorial(n - 1);
        }
    }
    %>

    <% 
        for(int i=1;i<=10;i++)
                out.println("The factorial of "+i+" is " + factorial(i)+"<br>");
    %>
</body>
</html>