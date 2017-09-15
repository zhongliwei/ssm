<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>中软国际TPG门户系统</title>
<link rel="stylesheet" href="css/login.css" type="text/css" />
</head>
<body>
	<form name="loginFrm" action="toIndex" method=post target="_top">

		<div class="main">
			<div id="logo">
				<img src="images/logo.jpg" width="102" height="69" />
			</div>
			<div id="zr">中软国际TPG门户系统</div>
			<div id="dl">
				<input type="text" name="userName" placeholder="请输入用户名" class="form1" />


				<div id="pwd">
					<input id="password" name="password" placeholder="请输入密码" type="text" class="form2" />
				</div>

				<input type="submit" class="button" value="" />
			</div>
			<div id="errorBox" style="display: none;"></div>
		</div>
		<div class="banquan">
			版权所有 © 中软国际科技服务有限公司2003-2013。保留一切权利。 </br> <a target="_blank"
				href="http://www.miitbeian.gov.cn"> 粤ICP备13058822号 </a>
		</div>
</body>
</html>