package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yedam.java.emp.domain.Emp;
import com.yedam.java.emp.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	// 전체조회
	@GetMapping("/empList")
	public String getEmpList(Model model) {
		model.addAttribute("empList", empService.getEmpList());
		
		return "emp/empList";
	}
	
	// 단건조회 - 수정, 목록으로
	@GetMapping("/getInfo")
	public String getEmpInfo(Model model, Emp emp) {
		model.addAttribute("empInfo", empService.getEmp(emp));
		
		return "emp/empInfo";
	}
	
	// 수정
	@PostMapping("/updateInfo")
	public String updateEmpInfo(Emp emp) {
		empService.updateEmp(emp);
		
		return "redirect:empList"; // redirect: --> view 가 아니라는 것을알려줌 
	}
	
	// 삭제
	@GetMapping("/deleteInfo/{employeeId}")
	public String deleteEmpInfo(@PathVariable int employeeId) {
		empService.deleteEmp(employeeId);
		
		return "redirect:/emp/empList";
	}
	
	// 등록 폼
	@GetMapping("/insertInfoForm")
	public String insertEmpInfoForm() {
		return "emp/empInsertForm";
	}
	
	// 등록
	@PostMapping("/insertInfo")
	public String insertEmpInfo(Emp emp) {
		System.out.println("emp = " + emp);
		empService.insertEmp(emp);
		return "redirect:empList";
	}
}
