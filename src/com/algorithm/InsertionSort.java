package com.algorithm;

import java.util.Scanner;

/**
 * @author Swasthik
 *Insertion Sort Implementation
 */
public class InsertionSort {

	static String[] words;
	static int count;

	public static void main(String[] args) {
		userInput();
		System.out.println("Before Sorting");
		print();
		sort();
		System.out.println("After Sorting");
		print();
	}

	/**
	 * Method that takes the user Input
	 */
	public static void userInput() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number of Elements");
		count = scanner.nextInt();
		words = new String[count];
		System.out.println("Enter " + count + " Elements");

		for(int i=0;i<count;i++) {
			words[i] = scanner.next();
		}
		scanner.close();
	}

	/**
	 * Method to print the Words Array
	 */
	public static void print() {
		for(String word: words) {
			System.out.println(word);
		}
		System.out.println();
	}

	/**
	 * Insertion sort Algorithm
	 */
	public static void sort() {

		for(int i=1;i<count;i++) {
			String word = words[i];
			int j = i-1;

			while(j >= 0 && words[j].compareTo(word)>0) {
				words[j+1] = words[j];
				j = j - 1;
			}
			words[j+1] = word;
		}
	}
}
