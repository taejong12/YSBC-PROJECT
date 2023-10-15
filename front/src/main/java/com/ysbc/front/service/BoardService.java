package com.ysbc.front.service;

import java.util.List;

import com.ysbc.front.dto.BoardDTO;

public interface BoardService {
	
	public List<BoardDTO> getBoardList();

	public void insertBoard(BoardDTO boardDto);
	
}
