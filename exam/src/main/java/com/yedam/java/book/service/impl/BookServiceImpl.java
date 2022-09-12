package com.yedam.java.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.domain.Book;
import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired BookMapper bookMapper;
	
	// 도서번호 자동 생성
	@Override
	public Integer getBookSerialNo() {
		return bookMapper.getBookSerialNo();
	}

	@Override
	public int registBook(Book book) {
		return bookMapper.insertBook(book);
	}

	@Override
	public List<Book> findAllBooks() {
		return bookMapper.selectAllBooks();
	}

	@Override
	public List<Book> bookRentStatus() {
		return bookMapper.selectRentStatus();
	}
	

	
}
