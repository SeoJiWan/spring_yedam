package com.yedam.java.emp.service;

import java.util.List;
import com.yedam.java.emp.domain.Emp;


public interface EmpService {
	// 전체조회
	public List<Emp> getEmpList();
	// 단건조회
	public Emp getEmp(Emp emp);
	// 등록
	public void insertEmp(Emp emp);
	// 수정 
	public void updateEmp(Emp emp);
	// 삭제
	public void deleteEmp(int employeeId);
}
