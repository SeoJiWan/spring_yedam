package com.yedam.java.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.yedam.java.book.domain.Book;
import com.yedam.java.book.service.BookService;

@Controller

public class BookController {
	
	@Autowired BookService bookService;
	
	// 전체 조회
	@GetMapping("/bookList")
	public String bookList(Model model) {
		List<Book> list = bookService.findAllBooks();
		list.forEach(System.out::println);
		model.addAttribute("books", list);
		return "book/bookList";
	}
	
	// 도서 등록폼
	@GetMapping("/bookInsert")
	public String bookInsertForm(Model model) {
		model.addAttribute("no", bookService.getBookSerialNo());
		return "book/bookInsert";
	}
	
	// 도서 등록
	@PostMapping("/bookInsert")
	public String insertBook(Book book) {
		System.out.println("book = " + book);
		System.out.println("tbook.getBookDate() = " + book.getBookDate());
		bookService.registBook(book);
		return "redirect:bookList";//
	}
	
	// 대여 현황
	@GetMapping("/rentList")
	public String bookRentStatus(Model model) {
		List<Book> rents = bookService.bookRentStatus();
		rents.forEach(System.out::println);
		model.addAttribute("rents", rents);
		return "book/rentList";
	}
	
	
}
