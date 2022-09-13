package com.yedam.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.domain.Todo;
import com.yedam.java.service.TodoService;

/**
 * Handles requests for the application home page.
 */

@RestController
@CrossOrigin(originPatterns = "http://127.0.0.1:5500")
public class HomeController {
	
	@Autowired TodoService todoService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Todo> home(Model model) {
		List<Todo> list = todoService.selectAll();
//		list.forEach(System.out::println);
		System.out.println("list = " + list);
		model.addAttribute("list", list);
		
		return list;
	}
	
	@GetMapping("/insert")
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
	
	@GetMapping("/update")
	public void updateItem(Todo todo) {
		System.out.println("update_todo = " + todo);
		todoService.updateItem(todo);
		//return "redirect:/";
	}
	
}
