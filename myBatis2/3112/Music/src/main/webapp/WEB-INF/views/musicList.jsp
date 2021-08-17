<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음악 목록 보기</title>
<link href="css/listMusicCSS.css" rel="stylesheet" type="text/css">
</head>
<body>
	<img src="img/soundd.png"/><br><br>
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
		            
		            <td><a href="/updateMusic?song_id=${music.song_id }">수정</a> / <a href="/deleteMusic?song_id=${music.song_id }">삭제</a>
	        	</tr>
			</c:forEach>
	        
	    </tbody>
	</table>
</body>
</html>