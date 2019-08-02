<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>곱구하기</title>
</head>
<body>
	<h2>두개의 숫자 파라미터의 곱 구하는 JSP</h2>
	<form action="<%= request.getContextPath()%>/jsp/mulResult.jsp" method="get">
		number : <input type="text" id="number" name="number">
		number2 : <input type="text" id="number2" name="number2">
		<input type="submit" value="OK">
	</form>
</body>
</html>