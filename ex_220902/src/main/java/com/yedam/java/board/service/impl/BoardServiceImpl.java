package com.yedam.java.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.board.doamin.Board;
import com.yedam.java.board.mapper.BoardMapper;
import com.yedam.java.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired BoardMapper boardMapper;
	
	
	@Override
	public int getBoardNo() {
		return boardMapper.getBoardNo().getBno();
	}
	
	@Override
	public List<Board> getBoardLIst() {
		return boardMapper.getBoardList();
	}

	@Override
	public Board getBoardInfo(Board board) {
		return boardMapper.getBoardInfo(board);
	}

	@Override
	public int insertBoard(Board board) {
		return boardMapper.insertBoard(board);
	}

	@Override
	public int updateBoard(Board board) {
		return boardMapper.updateBoard(board);
	}

	@Override
	public int deleteBaord(Board board) {
		return boardMapper.deleteBoard(board.getBno());
	}


}
