package com.yedam.java.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.board.doamin.Board;

public interface BoardMapper {
	//게시글 번호조회
	public Board getBoardNo();
	// 전체조회
	public List<Board> getBoardList();
	// 단건조회
	public Board getBoardInfo(Board board);
	// 등록
	public int insertBoard(Board board);
	// 수정
	public int updateBoard(Board board);
	//삭제
	public int deleteBoard(@Param("bno") int boardNo); // @Param : mybatis 에서 쓸 변수명 정의
}
