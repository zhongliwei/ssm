<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/list.css" type="text/css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css" />
<title>数据显示页面</title>

</head>
<body>
		<div class="header">
			<jsp:include page="common/head.jsp"/>
		</div>
		</br></br></br></br>
		
			<div class="context">
				<ul class="cardlist" style="width:100%;height:100%">
					<c:forEach var="user" items="${pageModel.getList()}" >
						
							<li class="carditem">
								<div>
									<h4>${user.id}</h4>					
									<p>${user.name}  ${user.password}</p>	
								</div>	
							</li>
						
					
					</c:forEach>
				</ul>
			</div>	
			
			
			<div class="fenye">			
				<a href='${pageContext.request.contextPath}/list/1'>首页</a>
				<a href='${pageContext.request.contextPath}/list/${pageModel.getPreviousPageNo()}'>上一页</a>
				<a href='${pageContext.request.contextPath}/list/${pageModel.getNextPageNo()}'>下一页</a>
				<a href='${pageContext.request.contextPath}/list/${pageModel.getBottomPageNo()}'>尾页</a>
				第${pageModel.pageNo}页
				共 ${pageModel.getTotalPages()}页 </td>
			</div>
			
			<div class="footer" style="position:fixed;bottom:50px">
				<jsp:include page="common/foot.jsp"/>
			</div>

</body>
</html>