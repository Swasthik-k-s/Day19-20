package com.algorithm;

import java.util.*;

public class MergeSort {

	static String[] words;
	static int count;
	
	public static void main(String[] args) {
		userInput();
		mergeSort(words,0,count - 1);
		print();
	}

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
	
	public static void mergeSort(String[] array, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
      
        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);
        merge(array, start, mid, end);
    }
	
	public static void merge(String[] a, int start, int mid, int end) {
		int count = end - start + 1;
		String[] b = new String[count];
		int loop1 = start;
		int loop2 = mid + 1;
		int index = 0;
		
		while(loop1 <= mid && loop2 <= end) {
			if(a[loop1].compareTo(a[loop2]) < 0) {
				b[index] = a[loop1];
				loop1++;
			} else {
				b[index] = a[loop2];
				loop2++;
			}
			index++;
		}
		
		while(loop1 <= mid) {
			b[index] = a[loop1];
			loop1++;
			index++;
		}
		
		while(loop2 <= end) {
			b[index] = a[loop2];
			loop2++;
			index++;
		}
		
		for(int i = 0; i < count; i++) {
			a[start + i] = b[i];
		}
	}
	
	public static void print() {
		System.out.println("Sorted Words");
		for(String word: words) {
			System.out.print(word + "\t");
		}
	}
}
