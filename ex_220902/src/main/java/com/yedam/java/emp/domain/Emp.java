package com.yedam.java.emp.domain;

import lombok.Data;

@Data
public class Emp {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String hireDate;
	String jobId;
	int salary;
	double commissionPct;
	int managerId;
	int departmentId;
}
