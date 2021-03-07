package com.aia.board.dao;

import java.util.List;

import com.aia.board.domain.Board;
import com.aia.board.domain.UploadRequest;

public interface BoardDao  {
    // 게시물 저장
	int boardinsert(UploadRequest request);
    // 전체 리스트 출력
	List<Board> selectAllBoardList();
    // 한 개의 게시물 출력
	Board selectBoardDetail(int idx);
    // 게시물 수정
	int updateBoard(Board board);
	// 게시글 삭제
	int deleteBoard(int idx);

}
