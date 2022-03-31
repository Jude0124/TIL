<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style type="text/css">
@import url("../css/my.css");
</style>
</head>
<body>   
 <h3>
  <%  String url=request.getContextPath(); %>
   
<form action="<%=url%>/score/insert.do" method="POST">
  이름을 입력하고 각각의 점수를 입력하세요 <br><br>
 
  이          름  : <input type="text" name="name"/><br>
     
 국어  점수 : <input type="text" name="kor"/><br>
   
 수학  점수 : <input type="text" name="mat"/><br>

 영어   점수 : <input type="text" name="eng"/><br><br>
  
       <input type="submit" value="확인 "/>
       <input type="reset" value="취소 "/>
 </form>
 </h3>    
    
</body>
</html>