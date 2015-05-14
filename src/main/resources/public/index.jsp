<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="alert alert-danger">There was a problem logging in.
		Please try again.</div>
	<form name="login" method="post">
		<div class="form-group">
			<label for="username">Username:</label> <input type="text"
				class="form-control" id="username" name="username" />
		</div>
		<div class="form-group">
			<label for="password">Password:</label> <input type="password"
				class="form-control" id="password" name="password" />
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

</body>
</html>