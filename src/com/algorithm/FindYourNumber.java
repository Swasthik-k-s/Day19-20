package com.algorithm;

import java.util.*;

public class FindYourNumber {

	static Scanner scanner = new Scanner(System.in);
	static int number;

	public static void main(String[] args) {
		userInput(Integer.parseInt(args[0]));
	}

	public static void userInput(int num) {
		System.out.println("Think of a number between 0 and " + (num - 1));
		number = scanner.nextInt();
		find(0, num - 1);
	}

	private static void find(int low, int high) {
		if (low == high) {
			System.out.println("Your number is " + low);
			return;
		}

		int mid = (low + high) / 2;
		String ch;
		if(low == mid) {
			System.out.println("Is your number " + low);
		} else {
			System.out.println("Is your number between " + low + " and " + mid);
		}
		ch = scanner.next();
		if (ch.equalsIgnoreCase("yes")) {
			find(low, mid);
		} else {
			find(mid + 1, high);
		}

	}

}
