<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="insertForm" action="insert" method="post" onsubmit="return false">
		<h3>게시글 등록</h3>
		<table>
			<tr>
				<!-- name 속성에는 엔티티의 필드명 기입 -->
				<td>글 번호</td>
				<td><input type="number" name="bno" value="${no }" readonly></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea name="contents"></textarea></td>
			</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td>이미지</td>
				<td><input type="text" name="image"></td>
			</tr>
			<!-- 
			<tr>
				<td>작성일자</td>
				<td><input type="date" name="regdate"></td>
			</tr>
			 -->
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
			insertForm.submit();
			
		}
	</script>
</body>
</html>