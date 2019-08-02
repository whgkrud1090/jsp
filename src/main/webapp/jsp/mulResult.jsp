<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
	<h2>파라미터들의 곱</h2>
	<%
	int number = Integer.parseInt(request.getParameter("number"));
	int number2 = Integer.parseInt(request.getParameter("number2"));
	
	int result = number * number2;
	%>
	<h3>result = <%= result %></h3>
</body>
</html>