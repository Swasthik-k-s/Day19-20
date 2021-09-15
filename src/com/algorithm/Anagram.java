package com.algorithm;

import java.util.*;

public class Anagram {

	static String str1, str2;

	public static void main(String[] args) {
		userInput();
		anagram();
	}

	public static void userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First String");
		str1 = scanner.next();
		System.out.println("Enter the Second String");
		str2 = scanner.next();
		scanner.close();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
	}

	public static void anagram() {
		int length1 = str1.length();
		int length2 = str2.length();
		int count = 0;

		if(length1 != length2) {
			System.out.println("Not a Anagram");
			return;
		}

		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		for(int i = 0;i < length1;i++) {
			for(int j = 0;j < length2;j++) {
				if(array1[i] == array2[j]) {
					count++;
					array2[j] = ' ';
					break;
				}
			}
		}
		
		if(count == length1) {
			System.out.println("2 Strings are Anagram");
		} else {
			System.out.println("Not a Anagram");
		}
	}
}
