<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h1>成功访问</h1>
	<form action="${pageContext.request.contextPath }/customer/saveCustomer.action" method="post">
	<div>
		<td>客户名称：</td>
		<td>
			<INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="name">
		</td>
	</div>
	<div>
		<td>客户年龄：</td>
		<td>
			<INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="age">
		</td>
	</div>
	<div>	
		<INPUT class=button id=sButton2 type=submit value=" 保存 " name=sButton2>
	</div>
	</form>
</body>
</html>