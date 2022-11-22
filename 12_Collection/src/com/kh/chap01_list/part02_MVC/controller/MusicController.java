package com.kh.chap01_list.part02_MVC.controller;

import java.util.ArrayList;
import java.util.Iterator;

import com.kh.chap01_list.part02_MVC.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스 (출력문 사용안함)


/**
 * @author 윤여진
 * @since 2022.11.22
 */
public class MusicController {
	private ArrayList<Music> list = new ArrayList<>();
	{ // 초기화 블럭
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
	}

	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	public ArrayList<Music> selectMusic() {
		return list;
	}
	
	public int deleteMusic(String title) {
		int result = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break;
			}
		}
		// result == 0: 삭제할 곡 못찾음 1: 성공적으로 삭제
		return result;
	}
	
	//1. 기본버전
	public ArrayList<Music> searchMusic(String keyword) {
		ArrayList<Music> searchList = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		return searchList;
	}
	
	//2. 심화버전
	public ArrayList<Music> searchMusic(int menu, String keyword){
		ArrayList<Music> searchList = new ArrayList<>();
		if (menu == 1) { // 곡명으로 검색
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else { // 가수명으로 검색
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		
		
		return searchList;
	}
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		int result = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result = 1;
				break;
			}
		}
		
		return result;
	}
	
} // 클래스 끝
