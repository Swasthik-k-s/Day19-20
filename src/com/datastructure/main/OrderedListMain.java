package com.datastructure.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.datastructure.dataStructure.OrderedList;
import com.datastructure.dataStructure.OrderedList.Node;

public class OrderedListMain<T> {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner r = new Scanner(System.in);
		OrderedList<Integer> list = new OrderedList<>();
		OrderedListMain<Integer> listDemo = new OrderedListMain<>();

		File file = new File("src/com/datastructure/input/OrderedList.txt");
		Scanner sc = new Scanner(file);

		String str;
		String s = "";
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			s = s + str;
		}
		sc.close();
		String[] arr = s.split(" ");// to split the string array
		System.out.println("File content is");
		listDemo.printArray(arr);
		Integer[] array = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			array[i] = Integer.parseInt(arr[i]);
			list.add(array[i]);
		}

		System.out.println("Ordered list is");
		list.display();

		System.out.println("Enter the element");
		Integer user = r.nextInt();
		boolean b = list.search(user);
		if (!b) {
			System.out.println("Not found " + user + " so adding to list");
			list.add(user);
		} else {
			System.out.println("Found " + user + " so removing from list");
			list.pop(user);
		}
		listDemo.write(list);

		list.display();

	}

	public static <T extends Comparable<T>> void printArray(T[] a) {
		for (T t : a) {
			System.out.print(t + " ");
		}
		System.out.println();
	}

	public void write(OrderedList list) {
		try {

			FileWriter fWriter = new FileWriter(
					"src/com/datastructure/output/OrderedList.txt");

			String text = "";

			Node temp;
			temp = list.getHead();
			while (temp.next != null) {
				text = text + temp.data + "----->";
				temp = temp.next;
			}
			text = text + temp.data;
			fWriter.write(text);

			fWriter.close();

			System.out.println("File is created successfully with the content.");
		}

		catch (IOException e) {

			System.out.print(e.getMessage());
		}
	}
}
