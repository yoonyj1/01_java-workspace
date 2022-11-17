package com.kh.chap01_list.part01.model.vo;

public class Music { // 클래스 시작
	// 필드부
	private String title; // 노래제목
	private String artist; // 가수
	
	// 생성자부
	public Music() {}

	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	// 메소드부
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "title: " + title + ", artist: " + artist;
	}
	
	
} // 클래스 끝
