package com.datastructure.main;

import com.datastructure.dataStructure.Calender;

public class CalenderMain {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		Calender.calender(month, year);
	}

}
