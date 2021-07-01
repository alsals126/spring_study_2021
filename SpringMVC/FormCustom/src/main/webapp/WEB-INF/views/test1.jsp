<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>결과 </title>
	</head>
	<body>
	<h1>Login</h1>
		<form action="/register" method="post">
			이름 : <input type="text" name="user_name" placeholder="이름" value=${requestScope.userDTO.user_name }>
			아이디 : <input type="text" name="user_id" placeholder="id" value=${requestScope.userDTO.user_id }>
			비밀번호 : <input type="password" name="user_pw" placeholder="password" value=${requestScope.userDTO.user_pw }>
			우편번호 : <input type="text" name="user_email" placeholder="우편번호" value=${requestScope.userDTO.user_email }>
			주소 : <input type="text" name="user_addr1" placeholder="집 주소" value=${requestScope.userDTO.user_addr1 }>
			상세 주소 : <input type="text" name="user_addr2" placeholder="상세 주소" value=${requestScope.userDTO.user_addr2 }>
			<input type="submit" name="submit" value="확인">
		</form>
	</body>
</html>