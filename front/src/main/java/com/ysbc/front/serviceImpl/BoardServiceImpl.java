package com.ysbc.front.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysbc.front.dao.BoardDAO;
import com.ysbc.front.dto.BoardDTO;
import com.ysbc.front.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardDTO> getBoardList() {
		return boardDao.getBoardList();
	}

	@Override
	public void insertBoard(BoardDTO boardDto) {
		boardDao.insertBoard(boardDto);
	}

}
