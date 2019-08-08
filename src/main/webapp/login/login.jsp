<%@page import="kr.or.ddit.user.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/css/signin.css" rel="stylesheet">

  </head>
  <body>

    <div class="container">
    <%
    	HttpSession httpsession = request.getSession();
                	User userVo = (User)httpsession.getAttribute("S_USERVO");
                	String userName = "";
                	userName = userVo == null ? "" : userVo.getUserNm();
    %>
		사용자 이름 : <%=userName%>
      <form action="<%=request.getContextPath() %>/login" method="post" class="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
		<%
// 			String userId = (String)request.getParameter("userId");
// 			userId = userId == null? "" : userId;
 		%> 
        <label for="userId" class="sr-only">UserId</label>
        <input type="text" id="userId" name="userId" class="form-control" placeholder="userId" value="brown"required autofocus > <!-- value="brown"-->
        
        <label for="pass" class="sr-only">Password</label>
        <input type="password" id="pass" name="pass" class="form-control" placeholder="Password" value="brown1234" required><!--value="brown1234"-->
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->
  </body>
</html>
