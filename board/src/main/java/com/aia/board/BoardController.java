package com.aia.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.aia.board.domain.Board;
import com.aia.board.domain.UploadRequest;
import com.aia.board.service.BoardDeleteService;
import com.aia.board.service.BoardEditService;
import com.aia.board.service.BoardListService;
import com.aia.board.service.BoardUploadService;
import com.aia.board.service.DetailBoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardUploadService uploadService;
	@Autowired
	private BoardListService listService;
	@Autowired
	private DetailBoardService detailService;
	@Autowired
	private BoardEditService editService;
	@Autowired
	private BoardDeleteService deleteService;
		
	// 게시판에 업로드
	@PostMapping("/board/upload")
	public String boardUpload(
			UploadRequest request) {
		
		uploadService.uploadService(request);
				
		return "index";
	}
	
	// 게시판 리스트 출력
	@GetMapping("/")
	public String getBoardList(Model model) {
		
		List<Board> boardList = listService.getBoardList();
		
		model.addAttribute("boardList", boardList);
		
		return "index";
	}
	
	// 게시판에서 해당idx와 일치하는 게시물 하나만 출력
	@GetMapping("/board/detail/{idx}")
	public String getBoardDetail(
			@PathVariable("idx") int idx,
			Model model) {
		
		Board board = detailService.getBoardDetail(idx);
		
		model.addAttribute("board", board);
		
		return "board/detailView";
	}
	
	// 게시글 수정
	@PostMapping("/board/edit/{idx}")
	public String boardEdit(
			@PathVariable("idx") int idx,
			Board board,
			Model model) {
				
		editService.editBoard(idx, board);
		
		return "index";
	}
	
	// 게시물 삭제
	@GetMapping("/board/delete/{idx}")
	public String boardDelete(
			@PathVariable("idx") int idx,
			Model model) {
		
		deleteService.deleteBoard(idx);
		
		return "index";
	}
	

}
