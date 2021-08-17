<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/addMusicCSS.css" rel="stylesheet" type="text/css">
</head>
<body>
	<img src="img/musicalnotes.png"/><br><br>
	<form action="/searchMusic" method="post">
		노래제목<input type="text" name="song_title"><br>
		<button type="submit" style="margin-top: 15px">SEARCH</button>
	</form>
</body>
</html>