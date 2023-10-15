package com.ysbc.front.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ysbc.front.dto.BoardDTO;
import com.ysbc.front.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/list")
	public String boardList(Model model) {
		System.out.println("boardList");
		
		List<BoardDTO> boardList = boardService.getBoardList();
		model.addAttribute("boardList", boardList);
		
		return "board/list";
	}
	
	@GetMapping("/write/form")
	public String boardWriteForm() {
		System.out.println("boardWriteForm");
		
		return "board/writeForm";
	}
	
	@PostMapping("/writing")
	public String boardWriting(BoardDTO boardDto) {
		System.out.println("boardWriting");
		
		boardService.insertBoard(boardDto);
		
		return "redirect:/board/list";
	}
	
}
