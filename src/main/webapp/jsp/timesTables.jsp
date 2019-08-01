<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	table, tr, td{
		border-collapse: collapse;
		border: 1px solid black;
		margin: 10px;
		padding: 10px;
	}
</style>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
	times Tables.jsp
	<table>
		<%for(int i = 1; i < 10; i++){ %>
		<tr>
			<%for(int j = 2; j < 10; j++){%>
				<% int gugudan = i*j; %>
				<td><%= j + " * " + i + " = " + gugudan %></td>
		    <%}%>
		</tr>
	  <%}%>
	</table>
</body>
</html>