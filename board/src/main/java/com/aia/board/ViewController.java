package com.aia.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {
	
	// 업로드 폼으로 이동
	@GetMapping("/board/upload")
	public String goToUpload() {
			
		return "board/uploadForm";
	}
		
	// 수정 폼으로 이동	
	@GetMapping("/board/edit/{idx}")
	public String goEditForm(
			@PathVariable("idx") int idx) {
			
		return "board/editForm";
	}
}
