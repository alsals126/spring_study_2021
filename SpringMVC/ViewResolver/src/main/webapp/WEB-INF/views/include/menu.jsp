<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <a href="/test1?a=100&b=200&c=300"/> param 으로 받기</a>
   <a href="/test2"/> Model로 받기</a>
   <a href="/test3"/> 로그인</a>
   <a href="/test4"/> ModelAndView</a>
   <!-- modelattribute로 받아서 model로 출력시켜봐 -->
   <a href="/test5?a=100&b=200&c=300">@ModelAttribute 1</a>
   <a href="/test6?a=1000&b=2000&c=3000">@ModelAttribute 자동주입</a>
   <a href="/test7?a=1000&b=2000&c=3000">@ModelAttribute 이름지정</a>
</body>
</html>