package com.datastructure.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.datastructure.dataStructure.UnOrderedList;
import com.datastructure.dataStructure.UnOrderedList.Node;

public class UnOrderedListMain {

	public static void main(String[] args) {
		UnOrderedListMain unOrderedListMain = new UnOrderedListMain();
		unOrderedListMain.readFile();
		unOrderedListMain.getUserInput();
		unOrderedListMain.writeFile();
	}
	
	UnOrderedList<String> list = new UnOrderedList<>();

	/**
	 * reads the text file and stores the content in array
	 */
	public <T> void readFile() {
		Scanner x;
		try {
			x = new Scanner(
					new File("src/com/datastructure/input/UnorderedList.txt"));

			String whole = "";
			while (x.hasNext()) {
				whole = whole + x.next() + " ";
			}
			T[] array = (T[]) whole.split(" ");
			// add(array);
			for (T t : array) {
				list.add(t);

			}
			System.out.println("Content of the file is stored in linked list as");
			list.display();

			x.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	public <T> void getUserInput() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter word you wanna search");
		T input = (T) r.next();
		boolean flag = list.search(input);
		if (flag) {
			System.out.println("Found " + input + " now removing it from list");
			list.remove(input);
			list.display();
		} else {
			System.out.println("Not Found " + input + " now adding it to list");
			list.add(input);
			list.display();
		}

	}

	public void writeFile() {
		try {
			FileWriter writer = new FileWriter(
					"src/com/datastructure/output/UnOrderedList.txt");
			Node temp;
			temp = list.getList();
			while (temp.next != null) {
				writer.write(temp.data + " ");
				temp = temp.next;

			}
			writer.write(temp.data + "");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
