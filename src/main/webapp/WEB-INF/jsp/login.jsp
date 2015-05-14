<%@ page import="java.util.*"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${ not empty error}">
	<div class="alert alert-danger">There was a problem logging in.
		Please try again.</div>
	</c:if>
	<c:if test="${ not empty logout}">
	<div class="alert alert-danger">You have been successfully logged out.</div>
	</c:if>	
	<form name="login" action="/login" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />	
		<div class="form-group">
			<label for="username">Username:</label> <input type="text"
				class="form-control" id="username" name="username" />
		</div>
		<div class="form-group">
			<label for="password">Password:</label> <input type="password"
				class="form-control" id="password" name="password" />
		</div>
		<input type="submit" name="submit" value="submit"/>
		
	</form>

</body>
</html>