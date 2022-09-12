<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {
		border-collapse: collapse;
	}
	td, th { 
		border: 1px solid black;
	}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>표지</th>
				<th>출판일자</th>
				<th>금액</th>
				<th>출판사</th>
				<th>도서소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.bookNo}</td>
				<td>${book.bookName}</td>
				<td><img alt="image" src="${pageContext.request.contextPath}/resources/images/${book.bookCoverimg}" style="width:100px; heigth:100px;"></td>
				<td><fmt:formatDate value="${book.bookDate}" pattern="yyyy/MM/dd"/></td>
				<td><fmt:formatNumber value="${book.bookPrice}" pattern="#,###" /></td>
				<td>${book.bookPublisher}</td>
				<td>${book.bookInfo}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>