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
	}else{
		alert("삭제되었습니다.");
		location.href="delete?song_id=" + ${music.song_id};
	}
</script>
<link href="css/addMusicCSS.css" rel="stylesheet" type="text/css">
</head>
<body>
	
</body>
</html>