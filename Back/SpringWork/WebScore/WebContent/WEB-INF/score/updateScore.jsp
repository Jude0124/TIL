<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<style type="text/css">
     input[type=text]  {
    width: 30%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box; 
    border: 2px solid red;
    border-radius: 4px;
 }
 input[type=button], input[type=submit], input[type=reset] {
     background-color: #4CAF50;
    border: none;
    color: white;
    padding: 16px 32px;
    text-decoration: none;
    margin: 4px 2px;
    cursor: pointer;
 }

</style>

</head>
<body>   
 <h3>
 <%  String url=request.getContextPath(); %>

<form action="<%=url%>/score/update.do" method="get">
  수정   <br><br>
 
Name : <input type="text"  readonly="readonly" 
   name="name"  value='${find.name}' /><br>
     
 Kor : <input type="text" name="kor" value='${find.kor}' /><br>
   
 Eng : <input type="text" name="mat"  value='${find.mat}' /><br>

Mat : <input type="text" name="eng" value='${find.eng}' /><br><br>
  
       <input type="submit" value="OK"/>
       <input type="reset" value="clear"/>
 </form>
 </h3>    
    
</body>
</html>