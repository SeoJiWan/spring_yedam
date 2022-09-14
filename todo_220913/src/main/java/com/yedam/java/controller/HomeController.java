package com.yedam.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yedam.java.domain.Todo;
import com.yedam.java.service.TodoService;

/**
 * Handles requests for the application home page.
 */

@RestController // method의 반환 결과를 JSON 형태로 반환
@CrossOrigin(originPatterns = "http://127.0.0.1:5500/")
public class HomeController {
	
	@Autowired TodoService todoService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping("/todo")
	public List<Todo> home(Model model) {
		List<Todo> list = todoService.selectAll();
//		list.forEach(System.out::println);
		System.out.println("list = " + list);
		model.addAttribute("list", list);
		
		return list;
	}
	
	@PostMapping("/todo")
	public void insertItem(Todo todo) {
		System.out.println("aaaaaaaa");
		todo.setNo(todoService.getTodoNo());
		todo.setId(0);
		todo.setTodoyn("0");
		
		System.out.println("todo = " + todo);
		todoService.insertItem(todo);
	}
	
	@DeleteMapping("/todo/{no}")
	public void deleteItem(@PathVariable int no) {
//		System.out.println("del_todo = " + todo);
		todoService.deleteItem(no);
//		return no;
	}
	
	@PutMapping("/todo")
	// 클라이언트에서 서버로 필요한 데이터를 요청하기 위해 JSON 데이터를 요청 본문에 담아서 서버로 보내면, 
	// 서버에서는 @RequestBody 어노테이션을 사용하여 
	// HTTP 요청 본문에 담긴 값들을 자바객체로 변환시켜, 객체에 저장
	public void updateItem(@RequestBody Todo todo) {
		System.out.println("update_todo = " + todo);
		todoService.updateItem(todo);
		//return "redirect:/";
	}
	
}
