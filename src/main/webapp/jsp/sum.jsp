<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>합구하기</title>
<script src="<%= request.getContextPath() %>/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<h2>두개의 숫자 파라미터를 받아 <br>
	두 숫자 사이의 모든 숫자의 합을 구하는 JSP</h2>
<pre>
	|파라미터 받기 연습|
	
	화면에 1~10사이에 있는 모든 숫자의 합을 출력
	
	* number파라미터는 number2 파라미터보다 항상 작다고 가정
	
	result : 합의 결과
</pre>
<form action= "<%= request.getContextPath() %>/jsp/sumResult.jsp">
	number : <input type="text" id="number" name="number"/>
	number2 : <input type="text" id="number2" name="number2"/>
	<input type="submit" value="OK"/>
</form>
</body>
</html>