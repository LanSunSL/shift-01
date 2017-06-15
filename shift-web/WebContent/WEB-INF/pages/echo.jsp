<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>SpringMVC妥妥的</title>
</head>
<body>
<h1>${echoMsg}</h1>
<form action="${pageContext.request.contextPath}/pages/abc.action" method="post">
	请输入信息：<input type="text" name="msg" id="msg">
	<input type="submit" value="提交">
</form> 
</body>
</html>