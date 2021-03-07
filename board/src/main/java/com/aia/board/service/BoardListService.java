package com.aia.board.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.board.dao.BoardDao;
import com.aia.board.domain.Board;

@Service
public class BoardListService {
	
    private BoardDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public List<Board> getBoardList(){
						
		dao = template.getMapper(BoardDao.class);
		
		return dao.selectAllBoardList();		
	}

}
