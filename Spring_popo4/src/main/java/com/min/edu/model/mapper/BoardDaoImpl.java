package com.min.edu.model.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.edu.dto.BoardDto;


@Repository
public class BoardDaoImpl implements IBoardDao{

	@Autowired
	private SqlSessionTemplate session;
	
	private String NS = "com.min.edu.model.mapper.BoardDaoImpl.";
	
	@Override
	public List<BoardDto> selectAll() {
		return session.selectList(NS+"selectAll");
	}

	@Override
	public int writeBoard(BoardDto dto) {
		return session.insert(NS+"writeBoard",dto);
	}

	@Override
	public BoardDto getOneBoard(String seq) {
		return session.selectOne(NS+"getOneBoard",seq);
	}

}
