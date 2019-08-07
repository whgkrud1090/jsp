<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>start ~ end의 합구하기</h2>
	<pre>
	단, start는 한상 end보다 작다.
	</pre>
	<form action="<%= request.getContextPath() %>/sumCalulation" method="post">
	start : <input type="text" id="start" name="start"/><br>
	end : <input type="text" id="end" name="end"/>
	<input type="submit" value="OK"/>
	</form>
</body>
</html>