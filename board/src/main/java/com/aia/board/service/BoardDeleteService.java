package com.aia.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.board.dao.BoardDao;

@Service
public class BoardDeleteService {
	
	private BoardDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public int deleteBoard(int idx) {
		
		dao = template.getMapper(BoardDao.class);	
		
		return dao.deleteBoard(idx);
	}

}
