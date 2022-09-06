package com.yedam.java.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.board.doamin.Board;
import com.yedam.java.board.service.BoardService;

@Controller
@RequestMapping("/board") // context-path/board/... 
public class BoardController {
	/*
	 * Field
	 */
	@Autowired BoardService boardService;
	

	/*
	 * Method
	 */	
	// 등록폼
	@GetMapping("/insert") //--> 동일한 경로라서 매핑방식이 다르면 다르게 인식
	public String insertBoardForm(Model model) {
		model.addAttribute("no", boardService.getBoardNo());
		return "board/insertForm";
	}
	
	// 등록
	@PostMapping("/insert")
	public String insertBoard(Board board) {
		boardService.insertBoard(board);
		return "redirect:list";
	}
	
	// 전체조회
	@GetMapping("/list")
	public String getBoardList(Model model) {
		model.addAttribute("boardList", boardService.getBoardLIst());
		return "board/boardList";
	}
	
	// 단건조회
	@GetMapping("/info")
	public String getBoardInfo(Model model, Board board) {
		model.addAttribute("board", boardService.getBoardInfo(board));
		return "board/boardInfo";
	}
	
	// 수정폼
	@GetMapping("/update")
	public String updateBoard(Model model, Board board) {
		// 수정폼에 세팅된 board 정보들 뿌려주기 위한 정보 전달
		model.addAttribute("board", boardService.getBoardInfo(board));
		
		return "board/UpdateForm";
	}
	
	// 수정
	@PostMapping("/update")
	public String updateBoard(Board board) {
		// 수정폼에서 수정된 정보들 받아와서 update
		boardService.updateBoard(board);
		return "redirect:list";
	}
	
	// 삭제
	@GetMapping("/delete")
	public String deleteBoard(Board board) {
		boardService.deleteBaord(board);
		return "redirect:list"; 
	}
}
