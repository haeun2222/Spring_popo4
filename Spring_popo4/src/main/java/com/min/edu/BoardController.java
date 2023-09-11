package com.min.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.min.edu.dto.BoardDto;
import com.min.edu.model.service.IBoardService;

@Controller
public class BoardController {

	@Autowired
	private IBoardService service;
	
	@GetMapping("/detail.do")
	public String detail(@RequestParam("seq") String id, Model model) {
		
		BoardDto dto = service.getOneBoard(id);
		model.addAttribute("dto",dto);
		return "detail";
	}
	
	
	@GetMapping("/writeForm.do")
	public String writeForm() {

		return "writeForm";
	}
	
	
	@PostMapping("/write.do")
	public String write(BoardDto dto) {
		int n = service.writeBoard(dto);
		
		return (n==1)?"redirect:/home.do":"redirect:/home.do";
	}
	
	
}
