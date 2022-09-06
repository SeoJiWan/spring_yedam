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
	<h3>게시글 수정</h3>
	<form name="updateForm" action="update" method="post" onsubmit="return false">
		<table>
			<tr>
				<th>번호</th>
				<td><input type="number" name="bno" value="${board.bno }" readonly="readonly"/></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value="${board.title }"/></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="3" cols="2" name="contents" style="width:100px;">${board.contents }</textarea></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" value="${board.writer }" readonly="readonly"/></td>
			</tr>
			<tr>
				<th>작성일자</th>
				<td><input type="text" value="<fmt:formatDate value="${board.regdate }" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			</tr>
			<tr>
				<th>마지막 수정</th>
				<td><input type="text" value="<fmt:formatDate value="${board.updatedate }" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td><img alt="image" src="<c:url value="/resources/images/${board.image }"/>"></td>
			</tr>
			
		</table>
		<button type="submit" onclick="checkForm()">등록</button>
		<button type="button" onclick="location.href='list'">목록</button>
	</form>
	
	<script type="text/javascript">
		function checkForm() {
			// getElementsByName 은 배열값으로 받아서 인덱스 접근이 필요
			let title = document.getElementsByName('title')[0];
			console.log(title);
			console.log(title.value);
			let contents = document.getElementsByName('contents')[0];
			console.log(contents);
			console.log(contents.value);
			let writer = document.getElementsByName('writer')[0];
			console.log(writer);
			console.log(writer.value);
			
			if (title.value == "") {
				alert("제목 미입력");
				title.focus();
				return;
			}
			if (contents.value == "") {
				alert("내용 미입력");
				contents.focus();
				return;
			}
			if (writer.value == "") {
				alert("작성자 미입력");
				writer.focus();
				return;
			}
			
			// form 태그는 name 속성을 주면 name 속성으로 제어 가능!
			updateForm.submit();
			
		}
	</script>
</body>
</html>