<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	//스클립틀릿
	/*
		jsp에 내장되어있는 기본 객체가 존재한다.
		
		1. request
		2. response
	*/
%>
<body>
	request.getLocalAddr() LOCAL IP = <%= request.getLocalAddr() %><br>
	request.getRemoteAddr() 클라이언트 IP = <%= request.getRemoteAddr()%><br>
	request.getContentLength() 요청정보길이 = <%= request.getContentLength()%><br>
	request.getCharacterEncoding() 요청정보인코딩 = <%= request.getCharacterEncoding()%><br>
	request.getContentType() 요청정보컨텐트타입 = <%= request.getContentType()%><br>
	request.getProtocol() 요청프로토콜 = <%= request.getProtocol()%><br>
	request.getMethod() 요청메소드 = <%= request.getMethod()%><br>
	request.getRequestURI() 요청 URI = <%= request.getRequestURI()%><br>
	<%-- getContextPath가 좀 중요하고 다른 메서드들은 잘 사용하지 않음 --%>
	request.getContextPath() CONTEXT.PATH = <%= request.getContextPath()%><br>
	request.getServerName() 서버이름 = <%= request.getServerName()%><br>
	request.getServerPort() 서버포트 = <%= request.getServerPort()%><br>
</body>
</html>