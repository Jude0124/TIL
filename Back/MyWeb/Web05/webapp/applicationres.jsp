<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>application</title>
</head>
<body>
<H1>Application�� �̿��� ������ Count</H1>
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

            session�� �̿���  ������ ���� �湮�� <%=counter%> 
        <br>
            application�� �̿���  ������ ���� �湮��  <%=applicationCounter%> 

</body>
</html>