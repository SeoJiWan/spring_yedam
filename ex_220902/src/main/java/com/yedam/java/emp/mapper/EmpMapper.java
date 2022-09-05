package com.yedam.java.emp.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.yedam.java.emp.domain.Emp;


public interface EmpMapper {
	// 전체조회
	public List<Emp> getEmpList();
	// 단건조회 : 조회조건 - Emp
	public Emp getEmp(Emp emp);
	// 등록
	public int insertEmp(Emp emp);
	// 수정 - 연봉 10% 인상
	// @Param("empId") --> 내가 사용하고자 하는 이름 정의
	public int updateSalary(@Param("empId") int employeeId);
	// 수정 - 사원정보를 넘겨받아서 이름과 성, 이메일을 수정할 수 있는 메서드
	public int updateEmpInfo(Emp emp);
	// 삭제 - id
	public int deleteEmp(@Param("empId") int employeeId);
}
