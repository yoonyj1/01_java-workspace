package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {};

	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		String str1 = "";
		
		while (stn.hasMoreTokens()) {
			str1 += stn.nextToken();
		}
		return str1;
	}

	public String firstCap(String input) {
		char ch = input.toUpperCase().charAt(0);
		String str = input.substring(1).toLowerCase();
		return ch + str;
	}

	public int findChar(String input, char one) {
		int count = 0;

		char[] arr = firstCap(input).toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (one == arr[i]) {
				count++;
			}
		}
		return count;
	}
	
	public int findChar2(String input, char one) {
		String sOne = one + "";
		char[] arr = input.toCharArray();
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			String str = ch + "";
			
			if(str.contains(sOne)) {
				count++;
			}
		}
		return count;
	}
}
