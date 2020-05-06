<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	
	<form id="f1" action="show" method="post">
		<div class="container">
			<input id="num" type="hidden" value="1" name="pageNum">
			姓名：<input type="text" name="name" value="${vo.name }">
			手机：<input type="text" name="phone" value="${vo.phone }">
			房型：<input type="text" name="type" value="${vo.type }"><br>
			房价：<input type="text" name="p1" value="${vo.p1 }">-<input type="text" name="p2" value="${vo.p2 }">
			预订日期：<input type="text" name="t1" value="<fmt:formatDate value='${vo.t1 }'/>">-<input type="text" name="t2" value='<fmt:formatDate value="${vo.t2 }"/>'>
			<input type="submit" value="查询">
			<table class="table table-striped">
			  <thead>
			    <tr>
			      <th scope="col">订单编号</th>
			      <th scope="col">预订日期</th>
			      <th scope="col">姓名</th>
			      <th scope="col">手机</th>
			      <th scope="col">类型</th>
			      <th scope="col">房价</th>
			      <th scope="col">备注</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach items="${list }" var="y">
			  		<tr>
				      <th scope="row">${y.yid }</th>
				      <td>
				      	<fmt:formatDate value="${y.ding }"/>
				      </td>
				      <td>${y.name }</td>
				      <td>${y.phone }</td>
				      <td>${y.type }</td>
				      <td>${y.price }</td>
				      <td>${y.com }</td>
				    </tr>
			  	</c:forEach>
			  
			    
			  </tbody>
			</table>
			
			
			
		</div>
		
		
		
		<jsp:include page="/WEB-INF/common/pages.jsp"></jsp:include>
	</form>
	
	
	<script type="text/javascript">
		function goPage(pageNum){
			$("#num").val(pageNum);
			$("#f1").submit();
		}
		
	</script>
	
	
	
	
	
</body>
</html>