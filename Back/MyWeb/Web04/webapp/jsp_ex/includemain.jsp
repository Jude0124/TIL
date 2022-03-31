<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>includemain</title>
</head>
<body>
	<div id="wrap" style="width: 800px; margin: auto;">
		<div id="header" style="height: 50px; background: pink; padding: 10px 60px;">
			<%@include file="includetitle.jsp"%>
		</div>
		<div id="main" style="margin-top: 10px;">
			<div id="left_main" style="height: 200px; width: 400px; float: left;">
				<%@include file="includeLogin.jsp"%>
				<%@include file="includeside_menu.jsp"%>
			</div>
			<div id="right_main" style="height: 250px; width: 390px; float: left;">
				<%@include file="includewelcome.jsp"%>
			</div>
		</div>
		<div style="clear: both;"></div>
		<div id="footer" style="height: 50px; margin-left: 10px; padding: 10px 20px; background: pink;">
			<%@include file="includebottom.jsp"%>
		</div>
	</div>
</body>
</html>
