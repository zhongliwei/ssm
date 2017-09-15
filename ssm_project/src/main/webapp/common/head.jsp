<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
body{
margin:0;
}
.flefe{
	left: 150px;
    position: absolute;
}
.fright{
    right: 20px;
    position: absolute;
}

</style>

		
			<div class="flefe">
				<a href="http://www.xiaocaiye.com"><image src="${pageContext.request.contextPath}/images/logo.png"></image></a>
			</div>
	
			<div class="fright ">
				<iframe name="weather_inc"
					src="http://i.tianqi.com/index.php?c=code&id=9" width="500"
					height="60" frameborder="0" marginwidth="0" marginheight="0"
					scrolling="no"></iframe>
			</div>
	
