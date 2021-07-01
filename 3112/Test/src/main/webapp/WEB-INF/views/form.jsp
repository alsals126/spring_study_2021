<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/form" method="post">
		이름 <input type="text" name="userName"><br>
		국어 <input type="text" name="userKor"><br>
		영어 <input type="text" name="userEng"><br>
		수학 <input type="text" name="userMath"><br>
		<button type="submit">확인</button>
	</form>
</body>
</html>