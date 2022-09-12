package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.domain.Book;

public interface BookMapper {
	// 도서번호 조회
	public Integer getBookSerialNo();
	// 등록
	public int insertBook(Book book);
	// 전체조회
	public List<Book> selectAllBooks(); 
	// 대여현황 조회
	public List<Book> selectRentStatus();
}
