<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="bookInsert" method="post" name="insertForm" onsubmit="return false">
		<table>
			<tr>
				<td>도서번호</td>
				<td><input type="number" name="bookNo" value="${no}" readonly></td>
			</tr>
			<tr>
				<td>도서명</td>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<td>도서표지</td>
				<td><input type="text" name="bookCoverimg"></td>
			</tr>
			<tr>
				<td>출판일자</td>
				<td><input type="date" name="bookDate"></td>
			</tr>
			<tr>
				<td>금액</td>
				<td><input type="number" name="bookPrice"></td>
			</tr>
			<tr>
				<td>출판사</td>
				<td><input type="text" name="bookPublisher"></td>
			</tr>
			<tr>
				<td>도서소개</td>
				<td><textarea rows="3" cols="2" name="bookInfo" style="width:200px"></textarea></td>
			</tr>
		</table>
		
		<button type="submit" onclick="checkForm()">등록</button>
		<button type="button" onclick="location.href='bookList'">조회</button>
	</form>
	
	<script type="text/javascript">
	function checkForm() {
		let name = document.getElementsByName('bookName')[0];
		console.log(name);
		console.log(name.value);
		
		let date = document.getElementsByName('bookDate')[0];
		console.log(date);
		console.log(date.value);
		
		if (name.value == "") {
			alert('도서명이 입력되지 않았습니다.')
			name.focus();
			return;
		}
		
		insertForm.submit();
	}
	</script>
</body>
</html>