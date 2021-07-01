<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form:form action="/result" modelAttribute="userDTO">
			이름 : <form:input path="user_name"/>
			아이디 : <form:input path="user_id"/>
			비밀번호 : <form:password path="user_pw"/>
			이메일 : <form:input path="user_email"/>
			주소 : <form:input path="user_addr1"/>
			주소 : <form:input path="user_addr2"/>
		</form:form>
	</body>
</html>