package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper mapper;
	
	@GetMapping("/emp") 
	public String emp(Model model, EmpVO empvo) {
		// url 로 파라미터 전달 하면 Model 에 의해 empvo 파라미터에 값이 담김
		System.out.println("error");
		EmpVO findEmp = mapper.getEmp(empvo);
		System.out.println("findEmp = " + findEmp);
		// Model 에 의해 값을 "emp"에 담아서 emp.jsp 에 전달
		model.addAttribute("emp", findEmp);
		return "emp";
	}
	
	@GetMapping("/emplist")
	public String empList(Model model, EmpVO empvo) {
		System.out.println("error");
		EmpVO findEmp = mapper.getEmp(empvo);
		System.out.println("findEmp = " + findEmp);
		model.addAttribute("emp", findEmp);
		return "emplist";
	}
}
