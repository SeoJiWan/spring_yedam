package com.yedam.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.java.domain.Todo;
import com.yedam.java.service.TodoService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired TodoService todoService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<Todo> list = todoService.selectAll();
		list.forEach(System.out::println);
		model.addAttribute("list", list);
		
		return "home";
	}
	
	@PostMapping("/insert")
	public String insertItem(Todo todo) {
		System.out.println("aaaaaaaa");
		todo.setNo(todoService.getTodoNo());
		todo.setId(0);
		todo.setTodoyn("0");
		
		System.out.println("todo = " + todo);
		todoService.insertItem(todo);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String deleteItem(Todo todo) {
		System.out.println("del_todo = " + todo);
		todoService.deleteItem(todo);
		return "redirect:/";
	}
	
	@GetMapping("/update")
	public String updateItem(Todo todo) {
		if (todo.getTodoyn().equals("1")) {
			todo.setTodoyn("0");
		}
		else {
			todo.setTodoyn("1");
		}
		System.out.println("update_todo = " + todo);
		todoService.updateItem(todo);
		return "redirect:/";
	}
	
}
