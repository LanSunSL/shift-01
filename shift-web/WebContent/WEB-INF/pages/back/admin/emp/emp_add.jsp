<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<title>排班</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/pages/emp/emp_add.js"></script>
</head>
<body>
	<img src="${pageContext.request.contextPath}/images/boxer.png">
	<form
		action="${pageContext.request.contextPath}/pages/back/admin/emp/emp_add.action"
		method="post" enctype="multipart/form-data">
		雇员编号：<input type="text" name=id id="id"><br> 
		雇员姓名：<input type="text" name="name" id="name"><br> 
		雇员性别：<input type="radio" name="sex" id="sex" value="0">女&nbsp;&nbsp; 
			<input type="radio" name="sex" id="sex" value="1">男<br> 
		手机号码：<input type="text" name="phone" id="phone"><br> 
		<input type="submit" value="增加"><input type="reset" value="重置">
	</form>
</body>
</html>