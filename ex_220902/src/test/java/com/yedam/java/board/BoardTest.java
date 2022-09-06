package com.yedam.java.board;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.yedam.java.board.doamin.Board;
import com.yedam.java.board.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
// application-context 경로 지정 : 
// servlet-context.xml -> 컴포넌트 스캔용,
// database-context.xml -> 비즈니스로직 사용 mybatis mapper 스캔용 )
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class BoardTest {
	
	@Autowired BoardService boardService;
	
	@Test
	public void 게시판테스트() {
		
		System.out.println("boardService = " + boardService);
		Board board = new Board();
//		board.setBNo(1);
		board.setContents("test contents");
//		board.setImage("test image");
//		board.setRegDate("test regdate");
		board.setTitle("test title");
//		board.setUpdateDate("test updatedate");
		board.setWriter("test writer");
		
		// 등록
		boolean result = boardService.insertBoard(board) > 0 ? true : false;
		assertEquals(result, true);
		
		// 단건조회
		Board findBoard = boardService.getBoardInfo(board);
		assertNotNull(findBoard);
		
		// 수정
		board.setContents("udpate test contents");
		result = boardService.updateBoard(board) > 0 ? true : false;
		assertEquals(result, true);
		
		// 전체조회
		List<Board> boardLIst = boardService.getBoardLIst();
		assertNotNull(boardLIst);
		
		// 삭제
		result = boardService.deleteBaord(board) > 0 ? true : false;
		assertEquals(result, true);
		
	}
}
