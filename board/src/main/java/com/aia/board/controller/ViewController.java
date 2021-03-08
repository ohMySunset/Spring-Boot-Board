package com.aia.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.aia.board.domain.Board;
import com.aia.board.service.BoardEditService;
import com.aia.board.service.DetailBoardService;

@Controller
public class ViewController {
	
	@Autowired
	private DetailBoardService detailService;
	
	// 업로드 폼으로 이동
	@GetMapping("/board/upload")
	public String goToUpload() {
			
		return "board/uploadForm";
	}
			
	// 수정 폼으로 이동	
	@GetMapping("/board/edit/{idx}")
	public String goEditForm(
			@PathVariable("idx") int idx,
			Model model) {
		
		Board oldData = detailService.getBoardDetail(idx);
		
		model.addAttribute("oldData", oldData);
		
		return "board/editForm";
	}
}
