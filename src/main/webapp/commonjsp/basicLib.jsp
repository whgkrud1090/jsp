<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	HttpServletRequest hsr = (HttpServletRequest) pageContext.getRequest();
   		hsr.getContextPath();
    %>
<%-- <script src="<%=request.getContextPath()%>/js/jquery-3.4.1.min.js"></script> --%>

<!-- el contextPath -->
<script src="${pageContext.request.contextPath }/js/jquery-3.4.1.min.js"></script>

<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<script src="<%=request.getContextPath()%>/js/jquery-3.4.1.min.js"></script>

<link href="<%=request.getContextPath()%>/css/dashboard.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/blog.css" rel="stylesheet">