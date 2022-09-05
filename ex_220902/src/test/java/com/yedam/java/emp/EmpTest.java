package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.domain.Emp;
import com.yedam.java.emp.mapper.EmpMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {
	
	@Autowired EmpMapper mapper;
	@Autowired ApplicationContext ac;
	
	@Test
	public void 모든놈검색() {
		List<Emp> empList = mapper.getEmpList();
		for (Emp emp : empList) {
			System.out.println(emp.getLastName());
		}
	}
	
	@Test
	public void beanTest() {
		EmpMapper bean = ac.getBean(EmpMapper.class);
		System.out.println("bean = " + bean);
		System.out.println("mapper = " + mapper);
		assertEquals(bean.getClass(), mapper.getClass());
		assertEquals(bean.getEmpList(), mapper.getEmpList());
	}
	
	@Test
	public void 사원한놈검색() {
		Emp emp = new Emp();
		emp.setEmployeeId(101);
		Emp findEmp = mapper.getEmp(emp);
		System.out.println("findEmp.getLastName() = " + findEmp.getLastName());
//		assertEquals(findEmp.getLastName(), "Popp");
		System.out.println("emp.getEmail() = " + emp.getEmail());
//		assertNotNull(emp.getEmail());
	}
	
	@Ignore
	public void 사원등록() {
		// employeeId 주지 않았음
		Emp emp = new Emp();
		emp.setFirstName("hoo2");
		emp.setLastName("ya2");
		emp.setEmail("yh@yahoo.com2");
		emp.setJobId("IT_PROG");
		emp.setSalary(9999);
		
		// insertEmp 수행 시 selectKey > keyProperty 속성에 의해 emp 에 바로 id가 세팅
		boolean result = mapper.insertEmp(emp) > 0 ? true : false;
		assertEquals(result, true);
	}
	
	@Ignore
	public void 사원연봉수정() {
		boolean result = mapper.updateSalary(208) > 0 ? true : false;
		assertEquals(result, true);
	}
	
	@Test
	public void 사원정보수정() {
		Emp emp = new Emp();
		emp.setEmployeeId(208);
		emp.setLastName("bbb");
//		emp.setFirstName("hohohoho");
//		emp.setEmail("yaya@hohohohohoho.com");
		
		assertEquals(mapper.updateEmpInfo(emp) > 0 ? true : false, true);
	}
	
	@Ignore 
	public void 퇴사합니다() {
		boolean result = mapper.deleteEmp(207) > 0 ? true : false;
		assertEquals(result, true);
	}
}
