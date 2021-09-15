package com.algorithm;

import java.util.*;

public class BubbleSort {

	static List<Integer> list = new ArrayList<>();
	static int count;

	public static void main(String[] args) {
		userInput();
		System.out.println("Before Sorting");
		print();
		sort();
		System.out.println("After Sorting");
		print();
	}

	public static void userInput() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of Elements");
		count = scanner.nextInt();
		System.out.println("Enter " + count + " Elements");

		for(int i = 0;i < count;i++) {
			list.add(scanner.nextInt());
		}
		scanner.close();
	}
	
	public static void sort() {
		int temp;
		for(int i = 0;i < count - 1;i++) {
			for(int j = 0;j< count - i - 1;j++) {
				if(list.get(j)>list.get(j+1)) {
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
	}

	public static void print() {
		for(Integer item: list) {
			System.out.println(item);
		}
		System.out.println();
	}
}
