package com.yedam.java.board.doamin;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

@Data
public class Board {
	private int bno;
	private String title;
	private String contents;
	private String writer;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedate;
	private String image;
}
