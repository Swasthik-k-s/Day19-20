package com.algorithm;

public class PrimePalindrome {

	public static void main(String[] args) {
		int from = 0;
		int to = 1000;
		System.out.println("Prime Numbers from " + from + " to " + to + " that are Palindrome and Anagram are");
		primeNumber(from,to);
	}

	public static void primeNumber(int min, int max) {
		if(min < 2) {
			min = 2;
		}
		for(int i = min;i < max;i++) {
			boolean prime = true;
			for(int j = 2;j < i/2;j++) {
				if(i % j == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				palindrome(i);
			}
		}
	}
	
	public static void palindrome(int num) {
		int number = num;
		int reverse = 0;
		
		while(num != 0) {
			int digit = num % 10;
			reverse = (reverse * 10) + digit;
			num = num / 10;
		}
		if(number == reverse) {
			System.out.print(number + " ");
		}
	}
}
