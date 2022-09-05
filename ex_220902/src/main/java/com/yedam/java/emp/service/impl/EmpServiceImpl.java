package com.yedam.java.emp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yedam.java.emp.domain.Emp;
import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpService;

@Service("empService") 
// 왜인진 모르겟으나 Service Bean이 두개가 등록이 됨
// autowired 시 이름을 정의할때 service 로 등록한 빈의 이름과 일치하여 사용
// 톰캣 서버도 클린해주는것이 좋음. -> 톰캣 서버도 캐시를 유지할 가능성 있음.
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpMapper empMapper;
	
	@Override
	public List<Emp> getEmpList() {
		return empMapper.getEmpList();
	}

	@Override
	public Emp getEmp(Emp emp) {
		return empMapper.getEmp(emp);
	}

	@Override
	public void insertEmp(Emp emp) {
		empMapper.insertEmp(emp);
	}

	@Override
	public void updateEmp(Emp emp) {
		empMapper.updateEmpInfo(emp);
	}

	@Override
	public void deleteEmp(int employeeId) {
		empMapper.deleteEmp(employeeId);
	}

}
