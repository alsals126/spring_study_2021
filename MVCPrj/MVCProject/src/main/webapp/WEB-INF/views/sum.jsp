<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>n부터 m까지의 합계</h1>
	<form action="/sum" method="post">
		n: <input type="number" name="n">
		m: <input type="number" name="m"> 
		<button type="submit">확인</button>
	</form>
	<br><br>
	${requestScope.sum }
</body>
</html>