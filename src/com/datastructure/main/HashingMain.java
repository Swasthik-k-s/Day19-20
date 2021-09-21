package com.datastructure.main;

import java.io.File;
import java.util.Scanner;

import com.datastructure.dataStructure.Hashing;

public class HashingMain {

	public static void main(String[] args) throws Exception {
		Hashing<Integer> hash = new Hashing<Integer>();

		File file = new File("src/com/datastructure/input/Hashing.txt");
		Scanner sc = new Scanner(file);
		String str;
		String s = "";
		while (sc.hasNextLine()) {
			str = sc.nextLine();
			s = s + str;
		}
		System.out.println(s);
		sc.close();
		String[] arr = s.split(" ");// to split the string array
		int[] arr2 = new int[arr.length];

		// for converting any String type in file to integer type
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}

		for (int i : arr2) {
			hash.add(i);

		}

		hash.write();

		hash.display();

	}

}
