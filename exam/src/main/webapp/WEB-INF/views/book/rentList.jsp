<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				<th>대여총계</th>
				<th>대여횟수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${rents}" var="book">
			<tr>
				<td>${book.bookNo}</td>
				<td>${book.bookName}</td>
				<td>${book.bookTotalPrice}</td>
				<td>${book.bookRentCnt}</td>	
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>