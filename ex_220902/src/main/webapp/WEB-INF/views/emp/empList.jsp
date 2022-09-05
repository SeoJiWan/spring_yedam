<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, tr, th, td {
		border: 1px solid black;
	}
	tr {
		cursor: pointer;
	}
	tr:hover {
		background-color: black;
		color: white;
	}
</style>
</head>
<body>
	<button type="button" onclick="location.href='insertInfoForm'">등록</button>
	<table>
	<c:forEach var="emp" items="${empList}">
		<tr onclick="location.href='getInfo?employeeId=${emp.employeeId}'">
			<td> ${emp.employeeId } </td>
			<td> ${emp.lastName } </td>
			<td> ${emp.firstName } </td>
			<td> ${emp.email } </td>
			<td> ${emp.jobId } </td>
			<td> ${emp.hireDate } </td>
			<td> ${emp.salary } </td>
			<td>
				<button type="button" id="${emp.employeeId }" onclick="deleteInfo(event, this.id)">삭제</button>
			</td>
		</tr>
	</c:forEach>
	</table>
	
	<script type="text/javascript">
		// 삭제 이벤트 - 상세보기로 가는 버블링 중단
		function deleteInfo(event, id) {
			event.stopPropagation();
			location.href='deleteInfo/' + id;
		}
	</script>


</body>
</html>