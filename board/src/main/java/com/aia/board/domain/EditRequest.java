package com.aia.board.domain;

public class EditRequest {
	
	private int idx;
	private String nickname;
	private String category;
	private String title;
	private String content;
	
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

	
	@Override
	public String toString() {
		return "UploadRequest [nickname=" + nickname + ", category=" + category + ", title=" + title + ", content="
				+ content + "]";
	}
	

}
