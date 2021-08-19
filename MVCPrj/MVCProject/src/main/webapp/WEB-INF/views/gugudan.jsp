<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
	단을 입력하세요
	<form action="/gugudan" method="post">
		<input type="number" name="dan">
		<button type="submit">확인</button>
	</form>
	<br><br>
	${requestScope.gugu }
</body>
</html>