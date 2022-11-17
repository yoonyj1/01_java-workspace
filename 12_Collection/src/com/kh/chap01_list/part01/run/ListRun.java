package com.kh.chap01_list.part01.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01.model.vo.Music;

public class ListRun { // 클래스 시작

	/*
	 * * 컬렉션
	 *  - 자료구조 개념이 내장되어있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"
	 *  
	 *  - 자료구조: 방대한 데이터를 보다 효율적으로 관리(조회, 정렬, 추가, 수정, 삭제)할 수 있도록 도와주는 개념
	 *  - 프레임워크: 이미 만들어져있는 틀(뼈대) => 그냥 가져다쓰면 됨
	 *  
	 * * 배열의 단점과 컬렉션의 장점
	 *  > 배열의 단점
	 *		1. 배열은 크기를 지정해야함. 한 번 지정된 크기를 변경할 수 없음
	 *		   새로운 값을 더 추가하고자하면 새로운 크기의 배열을 만들고 기존 배열을 복사하는 코드를 직접 기술
	 *
	 *		2. 배열 중간에 추가한다거나 삭제하는 경우 매번 땡겨주는 복잡한 알고리즘을 직접 기술해야함.
	 *	
	 *		3. 한 공간에 한 타입의 데이터들만 저장 가능
	 *
	 *  > 컬렉션의 장점
	 *  	1. 크기를 지정해줄 필요가 없음. 지정했다고 하더라도 더 많은 데이터가 들어오면 알아서 사이즈를 늘려줌
	 *  	   => 크기의 제약이 없음
	 *  
	 *  	2. 중간에 값을 추가한다거나 삭제하는 경우 값을 땡겨주는 작업(알고리즘)을 직접 기술할 필요 없음
	 *  	   => 메소드 호출으로 내부적으로 알아서 진행됨
	 *  
	 *		3. 한 공간에 여러 타입의 데이터들 저장 가능
	 *
	 * * 방대한 데이터들을 단지 보관만 해두고 조회만 할 경우 배열을 많이 사용
	 * 	 방대한 데이터들을 보관, 추가, 삭제 등등의 과정이 빈번한 경우에 컬렉션을 많이 사용 	
	 */
	
	public static void main(String[] args) { // main 시작

		ArrayList list = new ArrayList(3/*ArrayList의 크기*/); // 크기지정을 할수도 안할수도 있음 / 크기지정 안하면 기본크기 10
		
		System.out.println(list); // 안에 아무것도 없음(비어있는 상태) -> [] 출력
		
		// E -> Element: 리스트에 담길 데이터들(요소)
		
		// 1. add(E e): 리스트 공간 끝에 전달될 데이터를 추가시켜주는 메소드
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("죽일놈", "다이나믹듀오"));
		
		System.out.println(list); // [title: Attention, artist: 뉴진스, title: 새삥, artist: 지코, title: 죽일놈, artist: 다이나믹듀오] 출력
		
		list.add("가보자고");
		// 지정 된 크기보다 더 넣어도 오류가 안남	-> 장점1: 크기의 제약이 없음
		// 여러타입의 데이터를 저장할 수 있음		-> 장점3: 여러타입 보관 가능
		
		System.out.println(list); // [title: Attention, artist: 뉴진스, title: 새삥, artist: 지코, title: 죽일놈, artist: 다이나믹듀오, 가보자고] 출력
		// list 특징: 순서유지 담김 (0번 인덱스부터 차곡차곡)
		
		// 2. add(int index, E e): 직접 인덱스를 저장해서 해당 인덱스 위치에 데이터를 추가시켜주는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		// 중간 위치에 데이터 추가시 복잡한 알고리즘 구현 안함 -> 장점2
		
		System.out.println(list); // [title: Attention, artist: 뉴진스, title: 진심이 담긴 노래, artist: 케이시, title: 새삥, artist: 지코, title: 죽일놈, artist: 다이나믹듀오, 가보자고] 출력
		
		// 3. remove(int index): 해당 인덱스 위치의 데이터를 삭제시켜주는 메소드
		list.remove(1);
		
		System.out.println(list); // [title: Attention, artist: 뉴진스, title: 새삥, artist: 지코, title: 죽일놈, artist: 다이나믹듀오, 가보자고] 출력
		
		// 4. set(int index, E e): 해당 인덱스 위치의 데이터를 새롭게 전달된 e로 수정시켜주는 메소드
		list.set(0, new Music("nextLevel", "에스파"));
		
		System.out.println(list); // [title: nextLevel, artist: 에스파, title: 새삥, artist: 지코, title: 죽일놈, artist: 다이나믹듀오, 가보자고] 출력
		
		// 5. size(): 해당 리스트의 사이즈를 반환시켜주는 메소드 => 몇개의 데이터가 담겨있는지
		System.out.println("리스트의 사이즈: " + list.size());
		
		// 6. get(int index): 해당 인덱스 위치의 객체를 반환시켜주는 메소드
		// 변수에 저장해서 출력하는 방법
		Music m = (Music)list.get(0);
		String s = (String)list.get(3);
		
		System.out.println(m);
		System.out.println(s);
		
		// sysout으로 출력하는 방법
		System.out.println(list.get(1));
		
		System.out.println(((Music)list.get(1)).getTitle()); // Object 타입이기 때문에 강제형변환을 해줘야함
		
		// 7. subList(int index1, int index2): List : index1부터 index2전까지의 데이터를 추출해서 새로운 List로 반환 - substring 같은 개념
		List sub = list.subList(0, 2); // 반환형이 List이기 때문
		
		System.out.println(sub);
		
	} // main 끝

} // 클래스 끝
