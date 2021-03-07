package com.aia.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aia.board.dao.BoardDao;
import com.aia.board.domain.UploadRequest;

@Service
public class BoardUploadService {
	
	private BoardDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public int uploadService(UploadRequest request) {
		
		System.out.println(request);
		
		int result = 0;
		
		try {					
		dao = template.getMapper(BoardDao.class);
		result = dao.boardinsert(request);
		
		} catch(Exception e) {
			e.printStackTrace();
		}		
		return result;
	}

}
