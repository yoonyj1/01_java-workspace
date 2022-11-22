package com.kh.chap01_list.part01.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListSortRun {

	public static void main(String[] args) {

		// ArrayList 생성
		ArrayList<String> list = new ArrayList<>();
		{ // 초기화 블럭
			list.add("C");
			list.add("A");
			list.add("B");
			list.add("a");
		}
		
		System.out.println("원본: " + list); // 원본: [C, A, B, a]
		
		// 오름차순 정렬
// 옛날방식: Collections.sort(list);
		list.sort(Comparator.naturalOrder()); // 오름차순: [A, B, C, a]
		System.out.println("오름차순: " + list); // 오름차순: [A, B, C, a]
		
		// 내림차순 정렬
// 옛날방식: Collections.sort(list,Collections.reverseOrder());
		list.sort(Comparator.reverseOrder()); // 내림차순: [a, C, B, A]
		System.out.println("내림차순: " + list); // 내림차순: [a, C, B, A]
		
		// 대소문자 구분없이 오름차순
// 옛날방식: Collections.sort(list,String.CASE_INSENSITIVE_ORDER); // 대소문자 구분없는 오름차순: [a, A, B, C]
		list.sort(String.CASE_INSENSITIVE_ORDER); // 대소문자 구분없는 오름차순: [a, A, B, C]
		System.out.println("대소문자 구분없는 오름차순: " + list);
		
		// 대소문자 구분없이 내림차순
// 옛날방식: Collections.sort(list,Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		list.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER)); // 대소문자 구분없는 내림차순: [C, B, a, A]
		System.out.println("대소문자 구분없는 내림차순: " + list); // 대소문자 구분없는 내림차순: [C, B, a, A]
		
	}

}
