<%@page import="com.student.registration.service.impl.UserServiceImpl"%>
<%@ page import="java.util.*,java.sql.*"%>
<%@ page language="java"  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.student.registration.model.*" %>
<%@ page import="com.student.registration.service.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String confirm = request.getParameter("confirm");
	
	UserService um = new UserServiceImpl();
	User u = new User();
	u.setUsername(username);
	u.setPassword(password);
	if(um.exists(u)){
		response.sendRedirect("registerFailure.jsp");
	}
	else{
		um.add(u);
		response.sendRedirect("registerSuccess.jsp");
	}
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>处理中，请稍后~</title>
</head>
<body>

</body>
</html>