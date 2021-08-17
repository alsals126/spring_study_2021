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
	<table class="styled-table">
	    <thead>
	        <tr>
	        	<th>No</th>
	            <th>제목</th>
	            <th>가수</th>
	            <th>장르</th>
	            <th>가격</th>
	            <th>발매년도</th>
	            <th>선택</th>
	        </tr>
	    </thead>
	    <tbody>
		    <c:forEach var='music' items='${list}'>
				<tr>
		            <td>${music.song_id }</td>
		            <td>${music.song_title }</td>
		            <td>${music.song_singer }</td>
		            <td>${music.song_genre }</td>
		            <td>${music.song_price }</td>
		            <td>${music.song_date }</td>
	        	</tr>
			</c:forEach>
	        
	    </tbody>
	</table>
</body>
</html>