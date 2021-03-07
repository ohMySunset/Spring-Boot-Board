package com.aia.board.domain;

import java.sql.Timestamp;

public class Board {
		
	private int idx;
	private String nickname;
	private String category;
	private String title;
	private String content;
	private Timestamp writedate;
			
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getWritedate() {
		return writedate;
	}
	public void setWritedate(Timestamp writedate) {
		this.writedate = writedate;
	}
	
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", nickname=" + nickname + ", category=" + category + ", title=" + title
				+ ", content=" + content + ", writedate=" + writedate + "]";
	}
	

}
