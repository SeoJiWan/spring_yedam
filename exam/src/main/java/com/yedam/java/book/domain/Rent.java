package com.yedam.java.book.domain;

import lombok.Data;

@Data
public class Rent {
	private int bookNo;
	private String bookName;
	private int bookTotalPrice;
	private int bookRentCnt;
}
