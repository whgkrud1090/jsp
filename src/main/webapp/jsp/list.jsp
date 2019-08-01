<%@page import="kr.or.ddit.user.model.UserVo"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.repository.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserList</title>
<style type="text/css">
	body{
		font-family: '나눔고딕코딩'; 
		margin: 100px;
	}
	table, td, th{
		border-collapse: collapse;;
		border : 2px solid #9597df;
		text-align: center;
	}
	th{
		background: #5c5fce;
		color: white;;
		padding: 5px 30px;
	}
	
	td{
		background: #b4b5ff;
		color: white;;
		padding: 10px 30px;
	}
</style>
</head>
<body>
	<%-- 
		 1. userDao 선언
		 2. getUserList() 호출
		 3. 호출 결과(List<UserVo>)를 for loop를 통해 tr태그를 반복 생성
	--%>
	<table>
		<tr>
			<th>이름</th>
		</tr>
		<%
		UserDao userDao = new UserDao();
		List<UserVo> list = userDao.getUserList();
				 
		for(UserVo userVo : list){
		%>
			<tr>
				<td><%= userVo.getUserName() %></td>
			</tr>
	  <%} %>		
	</table>
</body>
</html>