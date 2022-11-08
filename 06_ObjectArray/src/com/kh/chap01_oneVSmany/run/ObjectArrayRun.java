package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun { // 클래스 시작

	public static void main(String[] args) { // main 시작

		Scanner sc = new Scanner(System.in);
		
		// 객체배열 활용해서 해보기
		// 3개의 Book 객체를 관리한다면
		Book[] books = new Book[3]; // 크기가 3인 객체배열
		
		for (int i = 0; i < books.length; i++) {
			System.out.print("책이름: ");
			String title = sc.nextLine();
			
			System.out.print("저자: ");
			String author = sc.nextLine();
			
			System.out.print("가격: ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사: ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title, author, price, publisher);
		} // 객체 생성 끝
		
		// System.out.println(books[0].information());
		// System.out.println(books[1].information());
		// System.out.println(books[2].information());
		
		// 전체 도서 정보들을 조회하기 (반복문 활용가능)
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].information());
		}
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 제목: ");
		String search = sc.nextLine();

		// if (books[0].getTitle().equals(search)) {
		// System.out.println(books[0].information());
		// }
		//
		// if (books[1].getTitle().equals(search)) {
		// System.out.println(books[1].information());
		// }
		//
		// if (books[2].getTitle().equals(search)) {
		// System.out.println(books[2].information());
		// }
		
		for (int i = 0; i < books.length; i++) {
			if (books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}

	} // main 끝

} // 클래스 끝
