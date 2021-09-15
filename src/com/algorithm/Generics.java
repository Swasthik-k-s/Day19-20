package com.algorithm;

import java.util.*;

public class Generics<T> {

	static Integer[] arr1 = {36,82,13,94,13,456,123,8,30};
	static Float[] arr2 = {4f,879f,254.4f,82f,14.9f,932f,58f};
	static String[] arr3 = {"java","python","program","class","object","generics","static"};

	public static void main(String[] args) {
		System.out.println("Generic Binary Search");
		binarySearch(arr3,"object");
		System.out.println("Generic Insertion Sort");
		insertionSort(arr2);
		System.out.println("Generic Merge Sort");
		Integer[] arr = mergeSort(arr1,0,arr1.length-1);
		for(Integer item: arr) {
			System.out.print(item + " ");
		}
	}

	public static <T extends Comparable<T>> void binarySearch(T[] array, T key) {
		T[] arr = bubbleSort(array);

		int start = 0;
		int end = arr.length - 1;
		int mid;

		while (start <= end) {
			mid = (start + end) / 2;

			if (arr[mid].compareTo(key) == 0) {
				System.out.println(key + " found at Position " + (mid + 1));
				return;
			} else if(arr[mid].compareTo(key) > 0) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.println(key + " not found");
	}

	public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {
		int length = array.length;
		T temp;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for(T item: array) {
			System.out.print(item + " ");
		}
		System.out.println();
		return array;
	}

	public static <T extends Comparable<T>> T[] insertionSort(T[] array) {
		int length = array.length;

		for(int i=1;i<length;i++) {
			T word = array[i];
			int j = i-1;

			while(j >= 0 && array[j].compareTo(word)>0) {
				array[j+1] = array[j];
				j = j - 1;
			}
			array[j+1] = word;
		}
		for(T item: array) {
			System.out.print(item + " ");
		}
		System.out.println();
		return array;
	}

	public static <T extends Comparable<T>> T[] mergeSort(T[] array, int start, int end) {
		if (start == end) {
			return array;
		}
		int mid = (start + end) / 2;

		mergeSort(array, start, mid);
		mergeSort(array, mid + 1, end);
		merge(array, start, mid, end);
		return array;
	}

	public static <T extends Comparable<T>> void merge(T[] a, int start, int mid, int end) {
		int count = end - start + 1;
		List<T> b = new ArrayList<T>();
		int loop1 = start;
		int loop2 = mid + 1;

		while(loop1 <= mid && loop2 <= end) {
			if(a[loop1].compareTo(a[loop2]) < 0) {
				b.add(a[loop1]);
				loop1++;
			} else {
				b.add(a[loop2]);
				loop2++;
			}
		}

		while(loop1 <= mid) {
			b.add(a[loop1]);
			loop1++;
		}

		while(loop2 <= end) {
			b.add(a[loop2]);
			loop2++;
		}

		for(int i = 0; i < count; i++) {
			a[start + i] = b.get(i);
		}
	}
}
