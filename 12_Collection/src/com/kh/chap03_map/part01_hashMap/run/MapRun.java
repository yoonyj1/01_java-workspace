package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun { // 클래스 시작

	public static void main(String[] args) { // main 시작
		
		HashMap hm = new HashMap();
		
		// 계층구조를 보면 List 계열, Set 계열의 클래스들은 Collection을 구현한 클래스임
		// => 객체를 추가하고자 할 때 add메소드 이용
		
		// Map 계열은 Collection을 구현한 클래스가 아님
		// 추가하고자 할 때 put 메소드 이용(이때 키 + 벨류 세트로 담아야함)
		
		// 1. put(K key, V value): 컬렉션에 키 벨류 세트로 추가시켜주는 메소드
		System.out.println("====== 1. put(K key, V value): 컬렉션에 키 벨류 세트로 추가시켜주는 메소드 ======");
		
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm);
		// {다이제=Snack [flavor=초코맛, calory=1500], 새우깡=Snack [flavor=짠맛, calory=500], 칸초=Snack [flavor=단맛, calory=600]} 출력
		// {키 = 벨류, 키 = 벨류...}
		// 저장되는 순서 유지 안됨 value값이 중복이 되더라도 키값이 중복이 안되면 잘 저장됨
		
		hm.put("새우깡", new Snack("매운맛", 700));
		System.out.println(hm);
		// {다이제=Snack [flavor=초코맛, calory=1500], 새우깡=Snack [flavor=매운맛, calory=700], 포테이토칩=Snack [flavor=짠맛, calory=500], 칸초=Snack [flavor=단맛, calory=600]} 출력
		// 키값이 중복되면 덮어쓰기가 됨
		// 동일한 키값으로 다시 추가하는 경우 value값이 덮어씌워짐(중복된 키값이 공존할 수 없음)
		
		// 2. get(Object key): V => 컬렉션에서 해당 키값을 가지는 value 값을 반환시켜주는 메소드
		System.out.println("====== 2. get(Object key): V => 컬렉션에서 해당 키값을 가지는 value 값을 반환시켜주는 메소드 ======");
		
		Snack s = (Snack)hm.get("다이제");
		System.out.println(s);
		
		// 3. size(): 컬렉션에 담겨있는 객체들의 개수 반환
		System.out.println("====== 3. size(): 컬렉션에 담겨있는 객체들의 개수 반환 ======");
		
		System.out.println("몇개 있을까? " + hm.size() + "개 있음");
		
		// 4. replace(K key, V value): 컬렉션에서 해당 키값을 찾아 다시 전달한 value값으로 수정하는 메소드
		System.out.println("====== 4. replace(K key, V value): 컬렉션에서 해당 키값을 찾아 다시 전달한 value값으로 수정하는 메소드 ======");
		
		hm.replace("포테이토칩", new Snack("겁나짠맛", 1000));
		
		System.out.println(hm);
		
		// 5. remove(Object key): 컬렉션에서 해당 키값을 찾고 키-벨류 세트를 삭제시켜주는 메소드
		System.out.println("====== 5. remove(Object key): 컬렉션에서 해당 키값을 찾고 키-벨류 세트를 삭제시켜주는 메소드 ======");
		
		hm.remove("포테이토칩");
		System.out.println(hm); 
		// {다이제=Snack [flavor=초코맛, calory=1500], 새우깡=Snack [flavor=매운맛, calory=700], 칸초=Snack [flavor=단맛, calory=600]}
		// 포테이토칩 삭제됨
		System.out.println();
		System.out.println("======================= HashMap 출력하는 방법 ===============================");
		
		// ArrayList는 안됨
		// System.out.println("====== ArrayList 사용 ======");
		// ArrayList list = new ArrayList(hm);		
		
		// Iterator 반복자 이용도 안됨 => list, set 계열에서만 사용가능
		// Iterator it = hm.iterator(); // 곧바로 호출못함 => list, set 계열에서만 사용가능한 메소드임 
		
		// Map을 Set으로 바꿔주는 메소드(2개) 제공함
		// Map계열 => Set 계열
		System.out.println("====== Map계열 => Set 계열 ======");
		// 1. keySet() 이용
		System.out.println("===== 1. ketSet() 이용 =====");
		// 1) hm에 있는 키들만 Set에 담기(키들의 집합형태)
		Set keySet = hm.keySet();
		
		// 2) 1번과정에서 작업된 keySet을 Iterator에 담기
		Iterator itKey = keySet.iterator();
		
		// 3) 반복문을 통해서 뽑기
		while (itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = (Snack)hm.get(key);
			System.out.println(key + "=" + value);
		}
		System.out.println();
		
		// 2. entrySet() 이용
		System.out.println("===== 2. entrySet() 이용 =====");
		
		// 1) hm.entrySet(): Set
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2) entrySet.iterator(): Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문을 통해서 가져오기
		while (itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			// 이 안에 key, value 둘 다 담겨있음
			
			String key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
	} // main 끝
	
} // 클래스 끝
