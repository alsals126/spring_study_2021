<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var pw = prompt("비밀번호를 입력하세요", "");
	if(pw != '${music.song_passwd}'){
		alert("비밀번호가 틀렸습니다.");
		location.href="musicList";
	}
</script>
<link href="css/addMusicCSS.css" rel="stylesheet" type="text/css">
</head>
<body>
	<img src="img/musicalnotes.png"/><br><br>
	<form action="/updateMusic?song_id=${music.song_id }" method="post">
		<b>음악제목</b>
		<input type="text" placeholder="${music.song_title}" name="song_title" required /><br>	
		<b>&nbsp;&nbsp; 가수 &nbsp;&nbsp;</b>
		<input type="text" placeholder="${music.song_singer}" name="song_singer" required /><br>		    
		<b>&nbsp;&nbsp; 장르 &nbsp;&nbsp;</b>
		<input type="text" placeholder="${music.song_genre}" name="song_genre" required /><br>		    
		<b>&nbsp;&nbsp; 가격 &nbsp;&nbsp;</b>
		<input type="text" placeholder="${music.song_price}" name="song_price" required /><br>		    
		<b>비밀번호</b>
		<input type="password" placeholder="${music.song_passwd} (수정삭제시 필요)" name="song_passwd" required /><br>		    
		<b>발매년도</b>
		<input type="text" placeholder="${music.song_date}" name="song_date" required /><br>
		    
		<button type="submit" style="margin-top:15px;">SET</button>
	</form> 
</body>
</html>