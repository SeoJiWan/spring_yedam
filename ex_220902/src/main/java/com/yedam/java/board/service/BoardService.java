package com.yedam.java.board.service;

import java.util.List;
import com.yedam.java.board.doamin.Board;

public interface BoardService {
	// 게시글 번호 조회
	public int getBoardNo();
	// 전체조회
	public List<Board> getBoardLIst();
	// 단건조회
	public Board getBoardInfo(Board board); 
	// 게시글 등록
	public int insertBoard(Board board);
	// 게시글 수정
	public int updateBoard(Board board);
	// 게시글 삭제
	public int deleteBaord(Board board);
}
