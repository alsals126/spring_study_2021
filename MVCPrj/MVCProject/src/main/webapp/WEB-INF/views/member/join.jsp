<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input {
	margin-right: 1px
}
</style>
</head>
<body>
	<form action="/joinMember" method="post">
		아이디 &nbsp;&nbsp;&nbsp;<input type="text" name="userid"><br> 
		비밀번호 <input type="text" name="passwd"><br>
		이름 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name"><br> 
		이메일 &nbsp;&nbsp;&nbsp;<input type="text" name="email"><br>
		<button type="submit">Join Us</button>
	</form>
</body>
</html>