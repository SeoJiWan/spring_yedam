package com.yedam.java.book.service;

import java.util.List;

import com.yedam.java.book.domain.Book;

public interface BookService {
	// 도서번호 조회
	public Integer getBookSerialNo();
	// 도서 등록
	public int registBook(Book book);
	// 도서 전체 조회
	public List<Book> findAllBooks();
	// 대여 현황 조회
	public List<Book> bookRentStatus();
}
