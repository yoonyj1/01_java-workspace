package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {
		// 사용자한테 가위바위보 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = sc.nextLine();

		String cResult = " "; // 컴퓨터 결과

		int count = 0;
		int winCount = 0;
		int drawCount = 0;
		int loseCount = 0;

		while (true) {
			// 프로그램 돌아가는 동안 컴퓨터에게 가위바위보 랜덤배정
			int random = (int) (Math.random() * 3 + 1);
			switch (random) {
			case 1:
				cResult = "가위";
				break;

			case 2:
				cResult = "바위";
				break;

			case 3:
				cResult = "보";
				break;
			}

			System.out.print("가위바위보 : ");
			String result = sc.nextLine();

			if (result.equals(cResult)) {// 비긴 경우
				System.out.println("컴퓨터 : " + cResult);
				System.out.println(name + " : " + result);
				System.out.println("비겼습니다.");
				drawCount++;
			} else {// 비기지 않은 경우
				System.out.println("컴퓨터 : " + cResult);
				System.out.println(name + " : " + result);
			}

			switch (result) {
			case "가위":
				if (cResult.equals("바위")) {
					System.out.println("졌습니다 ㅠㅠ");
					loseCount++;
				} else if (cResult.equals("보")) {
					System.out.println("이겼습니다!");
					winCount++;
				}
				break;

			case "바위":
				if (cResult.equals("보")) {
					System.out.println("졌습니다 ㅠㅠ");
					loseCount++;
				} else if (cResult.equals("가위")) {
					System.out.println("이겼습니다!");
					winCount++;
				}
				break;

			case "보":
				if (cResult.equals("가위")) {
					System.out.println("졌습니다 ㅠㅠ");
					loseCount++;
				} else if (cResult.equals("바위")) {
					System.out.println("이겼습니다!");
					winCount++;
				}
				break;

			case "exit":
				System.out.printf("%d전 %d승 %d무 %d패", count, winCount, drawCount, loseCount);
				sc.close();
				return;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}