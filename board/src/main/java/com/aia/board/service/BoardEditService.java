package com.aia.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.board.dao.BoardDao;
import com.aia.board.domain.Board;

@Service
public class BoardEditService {
	
	private BoardDao dao;
		
	@Autowired
	private SqlSessionTemplate template;
	
	public int editBoard(int idx, Board board) {
		
		dao = template.getMapper(BoardDao.class);		
		board.setIdx(idx);
		
		return dao.updateBoard(board);
	}
		

}
