package com.aia.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.board.dao.BoardDao;
import com.aia.board.domain.Board;

@Service
public class DetailBoardService {
	
    private BoardDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public Board getBoardDetail(int idx) {
		
		dao = template.getMapper(BoardDao.class);
		
		return dao.selectBoardDetail(idx);		
	}

}
