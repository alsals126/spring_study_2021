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
	<form action="/addMusic" method="post">
		노래제목<input type="text" name="song_title"><br>
		&nbsp;&nbsp;&nbsp;가수&nbsp;&nbsp;&nbsp;<input type="text" name="song_singer"><br>
		&nbsp;&nbsp;&nbsp;장르&nbsp;&nbsp;&nbsp;<input type="text" name="song_genre"><br>
		&nbsp;&nbsp;&nbsp;가격&nbsp;&nbsp;&nbsp;<input type="text" name="song_price"><br>
		비밀번호<input type="password" name="song_passwd"><br>
		발매년도<input type="text" name="song_date"><br><br>
		<button type="submit">SUBMIT</button>
	</form>
</body>
</html>