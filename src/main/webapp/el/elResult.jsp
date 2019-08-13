<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> el attribute</h2>
	elScope : ${elScope }<br>
	
	<h2>el parameter</h2>
	표현식 param : <%= request.getParameter("req") %><br>
	el param : ${param.req }<br>
	
	<h2>el cookie</h2>
	<%
		Cookie[] cookies = request.getCookies();
	
		for(Cookie cookie : cookies){
			String cookieValue = null;
			if("userId".equals(cookie.getName()))
				cookieValue = cookie.getValue();
		}%>
<%-- 	표현식cookie : <%= cookieValue %><br> --%>
	el Cookie : ${cookie.userId.value }<br>
</body>
</html>