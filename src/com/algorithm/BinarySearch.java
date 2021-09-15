package com.algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearch {

	static String[] wordArray;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		readFile();
		sort();
		System.out.println("\nEnter the Word to Search from the File");
		String key = scanner.next();
		scanner.close();
		binarySearch(key);
	}

	public static void readFile() {
		try {
			Scanner file = new Scanner(new File("G:/Assignments/Day19-20/src/com/algorithm/BinarySearch.txt"));
			String words = "";

			while (file.hasNext()) {
				words = words + file.next() + " ";
			}
			wordArray = words.split(" ");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void sort() {
		int length = wordArray.length;
		String temp;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (wordArray[j].compareTo(wordArray[j + 1]) > 0) {
					temp = wordArray[j];
					wordArray[j] = wordArray[j + 1];
					wordArray[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Words from the File");

		for (String word : wordArray) {
			System.out.print(word + "\t");
		}
	}

	public static void binarySearch(String key) {
		int left = 0;
		int right = wordArray.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;

			if (wordArray[mid].compareTo(key) == 0) {
				System.out.println(key + " found at Position " + (mid + 1));
				return;
			} else if(wordArray[mid].compareTo(key) > 0) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println(key + " not found");
	}
}
