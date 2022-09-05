<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- userList controller 로 데이터 전송 -->
	<form action="userList" method="post">
	
		<!-- name 속성은 엔티티의 필드와 일치 시켜야 함 -->
		<input type="text" name="list[0].name">
		<input type="number" name="list[0].age">
		<br>
		<input type="text" name="list[1].name">
		<input type="number" name="list[1].age">
		<br>
		<input type="text" name="list[2].name">
		<input type="number" name="list[2].age">
		
		<button type="submit">전송</button>
	</form>
</body>
</html>