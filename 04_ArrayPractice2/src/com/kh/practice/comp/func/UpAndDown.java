package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {

	public void upDown() {
		Scanner sc = new Scanner(System.in);

		// 1부터 100사이의 난수
		int random = (int) (Math.random() * 100 + 1);

		int count = 0;

		// 사용자는 난수 맞추기
		while (true) {
			System.out.print("1 ~ 100 사이의 임의의 난수를 맞춰보세요. : ");
			int num = sc.nextInt();

			if (num > 100 || num < 1) {
			} else {
				if (num < random) {
					System.out.println("UP !");
					count++;
				} else if (num > random) {
					System.out.println("DOWN !");
					count++;
				} else {
					System.out.println("정답입니다!!");
					break;
				}
			}
		}
		System.out.println(count + "회만에 맞추셨습니다.");
	}
}
