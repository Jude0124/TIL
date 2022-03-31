<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>application</title>
</head>
<body>
<H1>Application을 이용한 페이지 Count</H1>
        <%
        Integer counter = (Integer)session.getAttribute("counter");
        String heading = null;
        if (counter == null) {
            counter = new Integer(1);
        } else {
            counter = new Integer(counter.intValue() + 1);
        }

        session.setAttribute("counter", counter);

        Integer applicationCounter = (Integer)application.getAttribute("applicationCounter");
        if (applicationCounter == null) {
            applicationCounter = new Integer(1);
        } else {
            applicationCounter = new Integer(applicationCounter.intValue() + 1);
        }

        application.setAttribute("applicationCounter", applicationCounter);
        %>

            session을 이용한  페이지 접속 방문수 <%=counter%> 
        <br>
            application을 이용한  페이지 접속 방문수  <%=applicationCounter%> 

</body>
</html>