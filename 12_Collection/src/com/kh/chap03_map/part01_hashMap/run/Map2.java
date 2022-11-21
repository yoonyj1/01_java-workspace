package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Scanner;

public class Map2 { // 클래스 시작

	public static void main(String[] args) { // main 시작

		Scanner sc = new Scanner(System.in);

		HashMap<String, String> phoneNum = new HashMap<>();
		phoneNum.put("나", "010-5344-1864");
		phoneNum.put("엄마", "010-1234-5678");
		phoneNum.put("아빠", "010-2345-6789");
		phoneNum.put("ㄱㄴㄷ", "010-3456-7890");
		phoneNum.put("ㄴㄷㄹ", "010-4567-8901");
		phoneNum.put("ㄷㄹㅁ", "010-5678-9012");
		phoneNum.put("ㅁㅂㅅ", "010-6789-0123");

		while (true) {
			System.out.print("찾으려는 사람: ");
			String who = sc.nextLine();

			String result = phoneNum.get(who);

			if (who.equals("exit")) {
				System.out.print("프로그램을 종료하시겠습니까? (Y/N): ");
				char answer1 = sc.nextLine().charAt(0);

				if (answer1 == 'y' || answer1 == 'Y') {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					break;
				} else if (answer1 == 'n' || answer1 == 'N') {
					continue;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
			}

			if (result == null) {
				System.out.print("없는 사람입니다. 추가하겠습니까? (Y/N): ");
				char answer = sc.nextLine().charAt(0);

				if (answer == 'Y' || answer == 'y') {
					System.out.print("번호를 입력하세요: ");
					String newNum = sc.nextLine();

					phoneNum.put(who, newNum);
					System.out.println("새 번호가 추가되었습니다.");
				} else if (answer == 'n' || answer == 'N') {
					continue;
				}
			} else {
				System.out.println(result);
			}

		} // while 끝

	} // main 끝

} // 클래스 끝
