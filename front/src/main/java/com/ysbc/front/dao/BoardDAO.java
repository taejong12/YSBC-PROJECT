package com.ysbc.front.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ysbc.front.dto.BoardDTO;

@Mapper
public interface BoardDAO {
	public List<BoardDTO> getBoardList();
	public void insertBoard(BoardDTO boardDto);
}
