<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到德莱联盟</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css"/>
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>

</head>
<body>
	<div class="container">
		<div class="header">
			<jsp:include page="common/head.jsp"/>
		</div>
		</br></br></br></br>
		
		<div>
			<h1>Welcome user ${user.userName}, have a good day !</h1>
			<a href="${pageContext.request.contextPath}/list/1">hhh</a>
		</div>
	
		<div class="footer">
			<jsp:include page="common/foot.jsp"/>
		</div>
	</div>
	
</body>
</html>