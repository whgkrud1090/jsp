<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--
		파라미터를 받는다 
		input tag의 name속성이 파라미터 이름
		: userId, password
		
		String userId = request.getParameter("userId");
		** 조심 **String userId = request.getParameter(userId);
		String password = request.getParameter("password");
	-->
	<h2>request.getParameter</h2>
	<%
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
	%>
	parameter userId : <%= userId %><br>
	parameter password : <%= password %><br>
	
	<%
		String[] userIds = request.getParameterValues("userId");
	%>
	
	<h2>request.getParameterValues</h2>
	<%for(String str : userIds){%>
		parameter userIds : <%= str %><br>
	<%} %>

	<%
		Map<String, String[]> requestMap = request.getParameterMap();
		Set<String> ketSet = requestMap.keySet();
	%>
	<h2>request.getParameterMap</h2>
	<% for(String key : ketSet){ %>
			<%= key %> : <%= Arrays.toString(requestMap.get(key))%><br>
	<% }%>

	<h2>request.getParameterNames</h2>
	<%	Enumeration<String> paramtername = request.getParameterNames(); %>
	<%while(paramtername.hasMoreElements()){ 
		String paramterName = paramtername.nextElement();
	%>
		<%= paramterName %><br>
	<%} %>
</body>
</html>