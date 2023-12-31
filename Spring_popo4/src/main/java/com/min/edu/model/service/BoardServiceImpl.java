package com.min.edu.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.dto.BoardDto;
import com.min.edu.model.mapper.IBoardDao;

@Service
public class BoardServiceImpl implements IBoardService{

	@Autowired
	private IBoardDao dao;
	
	
	@Override
	public List<BoardDto> selectAll() {
		return dao.selectAll();
	}


	@Override
	public int writeBoard(BoardDto dto) {
		return dao.writeBoard(dto);
	}


	


	@Override
	public BoardDto getOneBoard(String seq) {
		return dao.getOneBoard(seq);
	}

}
