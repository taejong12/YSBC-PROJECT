<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 리스트 페이지</title>
</head>
<body>
	<h2>게시판 리스트</h2>
	
	<table id="boardTable" border="1">
		<tr>
			<td id="boardSeq">게시판넘버</td>
			<td id="boardTitle">제목</td>
			<td id="boardContent">내용</td>
			<td id="boardWriter">작성자</td>
			<td id="boardRegDate">등록일</td>
			<td id="boardUpdate">수정일</td>
		</tr>
		<c:choose>
			<c:when test="${empty boardList}">
				<tr>
					<td colspan="6">등록된 게시물이 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${boardList}" var="boardList" >
					<tr>
						<td>${boardList.boardSeq}</td>
						<td>
							<a href="/board/view?boardSeq=${boardList.boardSeq}">${boardList.boardTitle}</a>
						</td>
						<td>${boardList.boardContent}</td>
						<td>${boardList.boardWriter}</td>
						<td>${boardList.boardRegDate}</td>
						<td>${boardList.boardUpdate}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	
	<a href="write/form">게시글 작성하기</a>
</body>
</html>