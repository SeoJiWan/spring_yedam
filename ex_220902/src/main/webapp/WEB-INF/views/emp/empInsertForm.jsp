<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insertInfo" method="post">
		<div>
			<label>id : <input type="text" name="employeeId"></label>
		</div>
		<div>
			<label> first_name: <input type="text" name="firstName"></label>
		</div>
		<div>
			<label>last_name : <input type="text" name="lastName"></label>
		</div>
		<div>
			<label>email : <input type="text" name="email"></label>
		</div>
		<div>
			<label>phone_number : <input type="text" name="phoneNumber"></label>
		</div>
		<div>
			<label>hire_date: <input type="text" name="hireDate"></label>
		</div>
		<div>
			<label>job_id : <input type="text" name="jobId"></label>
		</div>
		<div>
			<label>salary : <input type="text" name="salary"></label>
		</div>
		<div>
			<label>commission_pct : <input type="text" name="commissionPct"></label>
		</div>
		<div>
			<label>manager_id : <input type="text" name="managerId"></label>
		</div>
		<div>
			<label>department_id : <input type="text" name="departmentId"></label>
		</div>
		<div>
			<button type="submit">등록</button>	
			<button type="button" onclick="location.href='empList'">목록으로</button>
		</div>
		
	</form>
</body>
</html>