<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<body>
    <h1>EL을 이용한 연산</h1>
    <table border="1">
      <tr>
        <td><b>표현식</b></td>
        <td><b>EL Expression</b></td>
        <td><b>결과 </b></td>
      </tr>    
      <tr>
        <td> 표현 [출력]</td>
        <td>${'${'}10}</td>
        <td>${10}</td>
      </tr>    
      <tr>
        <td>더하기 </td>
      <td>${'${'}10 + 10 }</td>
        <td>${10 + 10}</td>
      </tr>  
      <tr>
        <td>빼기</td>
        <td>${'${'}10 - 10 }</td>
        <td>${10 - 10}</td>
      </tr>    
      <tr>
        <td>곱하기</td>
        <td>${'${'}10 * 10 }</td>
        <td>${10 * 10}</td>
      </tr>  
      <tr>
        <td>나누기  / </td>
        <td>${'${'}10 / 3 }</td>
        <td>${10 / 3}</td>
      </tr>    
      <tr>
        <td>나누기 DIV</td>
        <td>${'${'}10 div 3 }</td>      
     <%--    <td>${10 div 3}</td>    --%> <!-- 주석을 풀고 실행 -->
      </tr>    
      <tr>
        <td>나머지[%] </td>
        <td>${'${'}10 % 10 }</td>
        <td>${10 % 3}</td>
      </tr>    
      <tr>
        <td>나머지[mod]</td>
        <td>${'${'}10 mod 10 }</td>
        <td>${10 mod 3}</td>
      </tr>    
      <tr>
        <td>0으로 나눈결과</td>
        <td>${'${'}10 / 0 }</td>
        <td>${10 / 0}</td>
      </tr>  
 <td>지수 </td>
        <td>${'${'}2E2}</td>
        <td>${2E2}</td>
      </tr>  
      <tr>
        <td>음 수</td>
        <td>${'${'}-10}</td>
        <td>${-10}</td>
      </tr> 
   </table>
   </body>
</html>

