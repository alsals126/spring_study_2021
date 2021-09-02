<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(function(){
		$("#btnUpdate").click(function(){
			document.form1.action="/member/update";
			document.form1.submit();
			})
		$("#btnDelete").click(function(){
			document.form1.action="/member/delete";
			document.form1.submit();
			})	
	})
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>회원정보</h1>
	<form method="post" name="form1">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid" value="${studentInfo.userid }" readonly></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="passwd" value="${studentInfo.passwd }"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${studentInfo.name }"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email" value="${studentInfo.email }"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="수정" id="btnUpdate">
				<input type="button" value="삭제" id="btnDelete"></td>
			</tr>
		</table>
	</form>
	<input type="button" value="회원가입" onclick="location.href='member/join'">
</body>
</html>