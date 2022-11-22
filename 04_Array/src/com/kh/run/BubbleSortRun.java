package com.kh.run;

public class BubbleSortRun {

	public static void main(String[] args) {
		int[] arr = { 22, 23, 53, 67, 11, 73, 50 };

		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) { // 사이클이 돌아가는 for 문
			for (int j = 1; j < arr.length; j++) { // 
				if (arr[j - 1] > arr[j]) { // 앞의 숫자가 뒤의 숫자보다 큰 경우
					temp = arr[j - 1]; // temp에 더 큰 숫자를 보관
					arr[j - 1] = arr[j]; // 더 작은 숫자를 앞으로 보내기
					arr[j] = temp; // temp에 저장한 숫자를 뒤로 보내기
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
