<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<jsp:useBean id="season" class="com.test.Season" scope="session"/>
   <h3>좋아하는 계절을 입력해주세요</h3>
   <hr>
   <form METHOD="post" ACTION="ELview03.jsp">   

	이름 :<input type="TEXT" Name="name" size="30"><br>
	좋아하는 계절 : <select name="selectSEASON">
	 <%for (String item: season.getSelectSEASON() ){
		 out.println("<option>"+item+"</option>");
	 }
   %>    
    </select> 
	<input type="submit" value="확인">
</form>
</body>
</html>