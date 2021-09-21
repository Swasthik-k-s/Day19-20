package com.datastructure.dataStructure;

import java.util.*;

public class PalindromeChecker {
	Stack stack = new Stack();
	Scanner scanner = new Scanner(System.in);
	
	public void checkPalindrome() {
		System.out.println("Enter the string");
		String string = scanner.next();
		string = string.toLowerCase();
		char[] charArray = string.toCharArray();
		String reversedString = "";
		for (int i = 0; i < charArray.length; i++) {
			stack.push(charArray[i]);
		}

		for (int i = 0; i < charArray.length; i++) {
			reversedString += stack.pop();
		}

		if (string.equals(reversedString)) {
			System.out.println("String is a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}
}
