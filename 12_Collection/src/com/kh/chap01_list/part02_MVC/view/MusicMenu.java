package com.kh.chap01_list.part02_MVC.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.chap01_list.part02_MVC.controller.MusicController;
import com.kh.chap01_list.part02_MVC.model.vo.Music;

// 화면을 담당하는 클래스 (출력문, 입력문)

/**
 * @author 윤여진
 * @since 2022.11.22
 * 
 */

public class MusicMenu {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();

	// 메인화면: 프로그램 실행 시 처음 보여주는 화면
	public void mainMenu() {
		while (true) {
			System.out.println("\n ==== Welcome 별밤 ====");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색");
			System.out.println("5. 특정곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴선택: ");
			int menu = 9;
			try {
				menu = sc.nextInt();
			} catch (InputMismatchException e) {
				
			}
			
			sc.nextLine();
			
			switch (menu) {
			case 1:
				insertMusic();
				break;

			case 2:
				selectMusic();
				break;
				
			case 3:
				deleteMusic();
				break;

			case 4:
				
				break;
				
			case 5:
				
				break;

			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			case 9:
			default:
				break;
			}
		}
	}
	
	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("\n === 새로운 곡 추가 ===");
		System.out.print("제목 입력: ");
		String title = sc.nextLine();
		
		System.out.print("가수 입력: ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title, artist);
		System.out.println("성공적으로 추가되었습니다.");
	}
	
	/**
	 * 2. 전체곡 조회용 서브화면
	 */
	public void selectMusic() {
		System.out.println("\n ==== 전체곡 리스트 ====");

		ArrayList<Music> list = mc.selectMusic();
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		if (list.isEmpty()) { // 리스트가 비었을 경우
			System.out.println("현재 존재하는 곡이 없습니다.");
		} else { 
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
	
	/**
	 * 3. 특정곡 삭제용 서브화면
	 */
	public void deleteMusic() {
		System.out.println("\n==== 특정곡 삭제 ====");
		
		System.out.print("삭제하고자 하는 곡명: ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if (result == 1) {
			System.out.println("성공적으로 삭제됐습니다.");
		} else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
	}

}
