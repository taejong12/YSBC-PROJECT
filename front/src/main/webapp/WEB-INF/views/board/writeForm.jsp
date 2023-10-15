<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성하기</title>
</head>
<body>
	<form action="/board/writing" method="post">   
		제목:<input type="text" name="boardTitle"><br/>
		내용:<input type="text" name="boardContent"><br/>
		작성자:<input type="text" name="boardWriter"><br/>
		<input type="submit" value="작성하기"><br/>
		<a href="board/list">목록</a>
	</form>
</body>
</html>