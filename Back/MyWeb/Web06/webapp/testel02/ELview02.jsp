
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<body>
<h1>EL의 내장객체</h1>
    <table border="1">
     <tr>
        <td><b>내장객체</b></td>
        <td><b>EL Expression</b></td>
        <td><b>결과 </b></td>
      </tr>    
       <tr>
        <td>내장객체[header]</td>
        <td>\${header["user-agent"]}</td>
        <td>${header["user-agent"]}</td>
      </tr>
<tr>
      <td>내장객체[header.cookie]</td>
        <td>\${header['cookie']} </td>
      <td>    ${header['cookie']}  </td>
      </tr>      
 <tr>
      <td>내장객체[header.host]</td>
        <td>\${header["host"]}</td>
      <td>    ${header['host']}  </td>
      </tr>
      </table>
</body>
</html>

