<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- action="updateInfo" 는 상대경로 (기존에 있던 getInfo 경로를 updateInfo 로 교체)
		 / 를 붙이면 context path 부터 full 경로 입력해야함 -->
	<form action="updateInfo" method="post">
		<div>
			<label>id : <input type="text" name="employeeId" value="${empInfo.employeeId}"></label>
		</div>
		<div>
			<label> first_name: <input type="text" name="firstName" value="${empInfo.firstName}"></label>
		</div>
		<div>
			<label>last_name : <input type="text" name="lastName" value="${empInfo.lastName}"></label>
		</div>
		<div>
			<label>email : <input type="text" name="email" value="${empInfo.email}"></label>
		</div>
		<div>
			<label>phone_number : <input type="text" name="phoneNumber" value="${empInfo.phoneNumber}"></label>
		</div>
		<div>
			<label>hire_date: <input type="text" name="hireDate" value="${empInfo.hireDate}"></label>
		</div>
		<div>
			<label>job_id : <input type="text" name="jobId" value="${empInfo.jobId}"></label>
		</div>
		<div>
			<label>salary : <input type="text" name="salary" value="${empInfo.salary}"></label>
		</div>
		<div>
			<label>commission_pct : <input type="text" name="commissionPct" value="${empInfo.commissionPct}"></label>
		</div>
		<div>
			<label>manager_id : <input type="text" name="managerId" value="${empInfo.managerId}"></label>
		</div>
		<div>
			<label>department_id : <input type="text" name="departmentId" value="${empInfo.departmentId}"></label>
		</div>
		<div>
			<button type="submit">수정</button>	
			<button type="button" onclick="location.href='empList'">목록으로</button>
		</div>
		
	</form>
</body>
</html>