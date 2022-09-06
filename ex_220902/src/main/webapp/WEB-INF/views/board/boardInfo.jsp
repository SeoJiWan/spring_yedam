<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${board.bno }번 게시글</h3>
	<table>
		<tr>
			<th>번호</th>
			<td>${board.bno }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${board.title }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="3" cols="2" style="width:100px;" readonly="readonly">${board.contents }</textarea></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${board.writer }</td>
		</tr>
		<tr>
			<th>작성일자</th>
			<td><fmt:formatDate value="${board.regdate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
		</tr>
		<tr>
			<th>마지막 수정</th>
			<td><fmt:formatDate value="${board.updatedate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
		</tr>
		<tr>
			<th>첨부파일</th>
			<td><img alt="image" src="<c:url value="/resources/images/${board.image }"/>"></td>
		</tr>
		
	</table>
	<button type="submit" onclick="location.href='update?bno=${board.bno}'">수정</button>
	<button type="submit" onclick="location.href='delete?bno=${board.bno}'">삭제</button>
	<button type="button" onclick="location.href='list'">목록</button>
</body>
</html>