package com.yedam.java.user.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.domain.User;
import com.yedam.java.user.domain.UserList;

@Controller
public class UserController {

	@RequestMapping("/inputForm")
	public String inputForm() {
		return "inputForm";
	}
	
//	@RequestMapping("/users")
//	public String process(User user) {
//		System.out.println("user.getName() = " + user.getName());
//		System.out.println("user.getAge() = " + user.getAge());
//		return "";
//	}
	
	@RequestMapping("/users")
	// @RequestParam : 파라미터를 전달 받을 때 사용
	// 파라미터의 name 과 view 단의 input name 속성의 name 과 일치
	public String process(@RequestParam String name, @RequestParam int age) {
		System.out.println("user.getName() = " + name);
		System.out.println("user.getAge() = " + age);
		return "";
	}
	
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		name.forEach(System.out::println);
		return "";
	}
	
	@RequestMapping("/userList")
	// view 에서 form 태그로 보낸 데이터들이 list 와 매핑됨
	public String listProcess(UserList list) {
		List<User> userList = list.getList();
		userList.forEach(System.out::println);
		return "";
	}
}
