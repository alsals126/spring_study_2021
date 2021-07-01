<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>register form</h1>
		<form action="/register" method="post">
			이름 : <input type="text" name="user_name" placeholder="이름">
			아이디 : <input type="text" name="user_id" placeholder="id">
			비밀번호 : <input type="password" name="user_pw" placeholder="password">
			우편번호 : <input type="text" name="user_email" placeholder="우편번호">
			주소 : <input type="text" name="user_addr1" placeholder="집 주소">
			상세 주소 : <input type="text" name="user_addr2" placeholder="상세 주소">
			<input type="submit" name="submit" value="확인">
		</form>
	</body>
</html>