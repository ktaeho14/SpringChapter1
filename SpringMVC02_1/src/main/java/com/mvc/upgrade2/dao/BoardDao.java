package com.mvc.upgrade2.dao;

import java.util.List;

import com.mvc.upgrade2.dto.BoardDto;

public interface BoardDao {
	public List<BoardDto> selectAll();
	public BoardDto selectOne(int myno);
	public int insert(BoardDto dto);
	public int update(BoardDto dto);
	public int delete(int myno);
}
