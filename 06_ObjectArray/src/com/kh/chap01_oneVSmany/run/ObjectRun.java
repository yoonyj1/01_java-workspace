package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		// 방법 1. 기본생성자로 생성한 후 setter 메소드를 이용해서 값 초기화
//		Book bk = new Book();
//		
//		bk.setTitle("자바의 정석");
//		bk.setAuthor("김김김");
//		bk.setPrice(10000);
//		bk.setPublisher("kh");
		
		// 방법 2. 매개변수생성자를 이용해서 생성과 동시에 값 초기화
		Book bk = new Book("자바의 정석", "김김김", 10000, "kh");
		
		// 응용. 사용자에게 입력받은 값으로 객체 생성 후 초기화
		Scanner sc = new Scanner(System.in);
		
		System.out.print("책이름: ");
		String title = sc.nextLine();
		
		System.out.print("저자: ");
		String author = sc.nextLine();
		
		System.out.print("가격: ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("출판사: ");
		String publisher = sc.nextLine();
		
		Book bk1 = new Book(title, author, price, publisher);
		System.out.println(bk1.information());
	}

}
