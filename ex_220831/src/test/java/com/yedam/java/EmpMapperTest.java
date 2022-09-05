package com.yedam.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpMapperTest {

	@Autowired 
	EmpMapper mapper;
	
	@Autowired
	ApplicationContext ac;
	
	@Test
	public void selectOne() {
		EmpVO emp = new EmpVO();
		emp.setEmployeeId("100");
		EmpVO findEmp = mapper.getEmp(emp);
		assertEquals(findEmp.getLastName(), "King");
	}
	
	@Test
	public void getBean() {
		EmpVO emp = new EmpVO();
		emp.setEmployeeId("100");
		EmpVO findEmp = mapper.getEmp(emp);
		
		EmpMapper bean = ac.getBean(EmpMapper.class);
		System.out.println("bean = " + bean.getEmp(findEmp));
		assertEquals(bean.getEmp(findEmp).getLastName(), "King");
	}
}
