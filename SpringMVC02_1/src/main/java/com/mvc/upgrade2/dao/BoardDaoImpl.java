package com.mvc.upgrade2.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mvc.upgrade2.dto.BoardDto;


@Repository
public class BoardDaoImpl implements BoardDao{

	@Override
	public List<BoardDto> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDto selectOne(int myno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int myno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
